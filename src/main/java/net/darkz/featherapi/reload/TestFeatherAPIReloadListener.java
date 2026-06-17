package net.darkz.featherapi.reload;

import java.util.concurrent.Executor;
import net.darkz.featherapi.FeatherAPI;
import net.darkz.featherapi.client.FeatherAPIClient;
import net.darkz.featherapi.loader.FeatherAPILoader;
import net.minecraft.server.packs.resources.ResourceManager;

public class TestFeatherAPIReloadListener extends AbstractResourceReloadListener {

	@Override
	public String getModId() {
		return FeatherAPI.MOD_ID;
	}

	@Override
	protected void reloadStuff(PreparationBarrier synchronizer, ResourceManager manager, Executor prepareExecutor, Executor applyExecutor) {
		if (FeatherAPILoader.isDevelopmentEnvironment()) {
			FeatherAPIClient.LOGGER.info("Reload Listener Works!");
		}
	}
}
