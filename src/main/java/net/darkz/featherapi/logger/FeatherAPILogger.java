package net.darkz.featherapi.logger;

import org.jetbrains.annotations.Nullable;
import lombok.*;

//? if >=1.17 {
import org.slf4j.*;
//?} else {
/*import org.apache.logging.log4j.*;
 *///?}

@SuppressWarnings("unused")
public class FeatherAPILogger {

	private final Logger logger;
	private final String name;

	@Nullable
	private final FeatherAPILogger parent;

	@Setter
	private boolean debugMode = false;

	public FeatherAPILogger(String name) {
		this.name   = name;
		this.logger = /*? if >=1.17 {*/LoggerFactory/*?} else {*//*LogManager*//*?}*/.getLogger(this.name);
		this.parent = null;
	}

	public FeatherAPILogger(String name, @Nullable FeatherAPILogger parent) {
		this.name   = name;
		this.logger = /*? if >=1.17 {*/LoggerFactory/*?} else {*//*LogManager*//*?}*/.getLogger(this.name);
		this.parent = parent;
	}

	private boolean isDebugModeEnabled() {
		return this.debugMode || (this.parent != null && this.parent.isDebugModeEnabled());
	}

	public void info(String text, Object... args) {
		this.getLogger().info(this.format(text), args);
	}

	public void warn(String text, Object... args) {
		this.getLogger().warn(this.format(text), args);
	}

	public void debug(String text, Object... args) {
		if (!this.isDebugModeEnabled()) {
			return;
		}
		this.getLogger().info("[%s/DEBUG]: %s".formatted(this.name, text), args);
	}

	public void error(String text, Object... args) {
		this.getLogger().error(this.format(text), args);
	}

	public FeatherAPILogger extend(String name) {
		return new FeatherAPILogger("%s/%s".formatted(this.name, name), this);
	}

	private String format(String text) {
		return "[%s]: %s".formatted(this.name, text);
	}

	private Logger getLogger() {
		if (this.parent != null) {
			return this.parent.getLogger();
		}
		return this.logger;
	}
}