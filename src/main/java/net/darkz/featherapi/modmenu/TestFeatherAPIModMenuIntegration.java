package net.darkz.featherapi.modmenu;

import net.darkz.featherapi.FeatherAPI;
import net.darkz.featherapi.yacl.TestFeatherAPIYACLConfigurationScreen;
import net.minecraft.client.gui.screens.Screen;

public class TestFeatherAPIModMenuIntegration extends AbstractModMenuIntegration {

	@Override
	protected String getModId() {
		return FeatherAPI.MOD_ID;
	}

	@Override
	protected Screen createConfigScreen(Screen parent) {
		return TestFeatherAPIYACLConfigurationScreen.createTestScreen(parent);
	}
}

