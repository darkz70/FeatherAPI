package net.darkz.featherapi.config;

import lombok.*;
import net.darkz.featherapi.loader.FeatherAPILoader;
import net.darkz.featherapi.utils.*;
import org.slf4j.*;

import com.mojang.serialization.*;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.darkz.featherapi.FeatherAPI;

import java.io.*;
import java.util.concurrent.CompletableFuture;

import static net.darkz.featherapi.utils.CodecUtils.option;

@Getter
@Setter
@AllArgsConstructor
public class FeatherAPIConfig {

	public static final Codec<FeatherAPIConfig> CODEC = RecordCodecBuilder.create(instance -> instance.group(
			option("mossy", false, Codec.BOOL, FeatherAPIConfig::isFeatherAPI)
	).apply(instance, FeatherAPIConfig::new));

	private static final File CONFIG_FILE = FeatherAPILoader.getConfigDir().resolve(FeatherAPI.MOD_ID + ".json5").toFile();
	private static final Logger LOGGER = LoggerFactory.getLogger(FeatherAPI.MOD_NAME + "/Config");
	private static FeatherAPIConfig INSTANCE;
	
	private boolean mossy;

	private FeatherAPIConfig() {
		throw new IllegalArgumentException();
	}

	public static FeatherAPIConfig getInstance() {
		return INSTANCE == null ? reload() : INSTANCE;
	}

	public static FeatherAPIConfig reload() {
		return INSTANCE = FeatherAPIConfig.read();
	}

	public static FeatherAPIConfig getNewInstance() {
		return CodecUtils.parseNewInstanceHacky(CODEC);
	}

	private static FeatherAPIConfig read() {
		return ConfigUtils.readConfig(CODEC, CONFIG_FILE, LOGGER);
	}

	public void saveAsync() {
		CompletableFuture.runAsync(this::save);
	}

	public void save() {
		ConfigUtils.saveConfig(this, CODEC, CONFIG_FILE, LOGGER);
	}
}
