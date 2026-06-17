package net.darkz.featherapi.yacl;

import lombok.experimental.ExtensionMethod;
import net.darkz.featherapi.FeatherAPI;
import net.darkz.featherapi.yacl.api.*;
import net.darkz.featherapi.config.FeatherAPIConfig;
import net.darkz.featherapi.utils.ModMenuUtils;
import net.darkz.featherapi.yacl.extension.SimpleOptionExtension;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import java.util.function.Function;

@ExtensionMethod(SimpleOptionExtension.class)
public class TestFeatherAPIYACLConfigurationScreen {

	private static final Function<Boolean, Component> ENABLED_OR_DISABLE_FORMATTER = ModMenuUtils.getEnabledOrDisabledFormatter();

	private TestFeatherAPIYACLConfigurationScreen() {
		throw new IllegalStateException("Screen class");
	}

	public static Screen createTestScreen(Screen parent) {
		FeatherAPIConfig defConfig = FeatherAPIConfig.getNewInstance();
		FeatherAPIConfig config = FeatherAPIConfig.getInstance();

		return SimpleYACLScreen.startBuilder(FeatherAPI.MOD_ID, parent, config::saveAsync)
				.categories(getGeneralCategory(defConfig, config))
				.build();
	}

	private static SimpleCategory getGeneralCategory(FeatherAPIConfig defConfig, FeatherAPIConfig config) {
		return SimpleCategory.startBuilder("general")
				.groups(getFeatherAPIGroup(defConfig, config));
	}

	private static SimpleGroup getFeatherAPIGroup(FeatherAPIConfig defConfig, FeatherAPIConfig config) {
		return SimpleGroup.startBuilder("mossy_group").options(
				SimpleOption.<Boolean>startBuilder("mossy")
						.withBinding(defConfig.isFeatherAPI(), config::isFeatherAPI, config::setFeatherAPI, true)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("mossy", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("mossy", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("mossy", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("mossy", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("mossy", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("mossy", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("mossy", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("mossy", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("mossy", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("mossy", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("mossy", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE)
		);
	}

}


