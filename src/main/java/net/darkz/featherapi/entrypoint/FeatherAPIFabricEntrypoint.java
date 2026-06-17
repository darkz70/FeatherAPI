package net.darkz.featherapi.entrypoint;

//? if fabric {

import net.darkz.featherapi.FeatherAPI;

import net.fabricmc.api.ModInitializer;

public class FeatherAPIFabricEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		FeatherAPI.onInitialize();
	}
}

//?}
