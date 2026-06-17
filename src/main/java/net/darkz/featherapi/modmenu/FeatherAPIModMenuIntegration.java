package net.darkz.featherapi.modmenu;

import net.darkz.featherapi.FeatherAPILib;
import net.darkz.featherapi.yacl.FeatherAPITestYACLConfigurationScreen;
import net.minecraft.client.gui.screens.Screen;

public class FeatherAPILibModMenuIntegration extends AbstractModMenuIntegration {

	@Override
	protected String getModId() {
		return FeatherAPILib.MOD_ID;
	}

	@Override
	protected Screen createConfigScreen(Screen parent) {
		return FeatherAPITestYACLConfigurationScreen.createTestScreen(parent);
	}
}

