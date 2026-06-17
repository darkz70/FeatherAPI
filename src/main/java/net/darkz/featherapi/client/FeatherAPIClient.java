package net.darkz.featherapi.client;

import net.darkz.featherapi.client.command.TestFeatherAPICommandsManager;
import net.darkz.featherapi.loader.FeatherAPILoader;
import net.darkz.featherapi.logger.FeatherAPILogger;

import net.darkz.featherapi.FeatherAPI;
import net.darkz.featherapi.reload.TestFeatherAPIReloadListener;

public class FeatherAPIClient {

	public static FeatherAPILogger LOGGER = FeatherAPI.LOGGER.extend("Client");

	public static void onInitializeClient() {
		LOGGER.info("{} Client Initialized", FeatherAPI.MOD_NAME);
		FeatherAPILoader.registerReloadListener(new TestFeatherAPIReloadListener());
		FeatherAPILoader.registerCommands(TestFeatherAPICommandsManager::register);
	}

}
