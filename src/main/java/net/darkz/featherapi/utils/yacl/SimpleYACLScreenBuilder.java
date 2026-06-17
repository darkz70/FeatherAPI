package net.darkz.featherapi.utils.yacl;

import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.api.YetAnotherConfigLib.Builder;
import net.darkz.featherapi.yacl.utils.YACLScreenConsumer;

public interface SimpleYACLScreenBuilder {

	static Builder startBuilder(YACLScreenConsumer consumer) {
		return ((SimpleYACLScreenBuilder) YetAnotherConfigLib.createBuilder()).featherapi$setConsumer(consumer);
	}

	Builder featherapi$setConsumer(YACLScreenConsumer consumer);
}
