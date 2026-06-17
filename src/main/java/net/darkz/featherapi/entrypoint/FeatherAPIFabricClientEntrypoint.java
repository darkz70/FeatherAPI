package net.darkz.featherapi.entrypoint;

//? if fabric {

import net.fabricmc.api.ClientModInitializer;

import net.darkz.featherapi.client.FeatherAPIClient;

public class FeatherAPIFabricClientEntrypoint implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		FeatherAPIClient.onInitializeClient();
	}
}

//?}
