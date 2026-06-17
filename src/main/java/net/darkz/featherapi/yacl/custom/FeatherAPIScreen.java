package net.darkz.featherapi.yacl.custom;

import net.minecraft.client.Minecraft;

public interface FeatherAPIScreen {

	@SuppressWarnings("all")
	static boolean isFeatherAPIScreen() {
		return Minecraft.getInstance().screen instanceof FeatherAPIScreen;
	}

}
