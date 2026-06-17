package net.darkz.featherapi.entrypoint;

//? if neoforge {
/*import net.darkz.featherapi.FeatherAPI;

import net.darkz.featherapi.client.FeatherAPIClient;
import net.darkz.featherapi.modmenu.*;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.*;
import net.neoforged.fml.common.Mod;

@Mod(value = FeatherAPI.MOD_ID, dist = Dist.CLIENT)
public class FeatherAPINeoForgeClientEntrypoint {

	public FeatherAPINeoForgeClientEntrypoint(ModContainer container) {
		FeatherAPIClient.onInitializeClient();
		TestFeatherAPIModMenuIntegration integration = new TestFeatherAPIModMenuIntegration();
		integration.register(container);
	}

}

*///?}

