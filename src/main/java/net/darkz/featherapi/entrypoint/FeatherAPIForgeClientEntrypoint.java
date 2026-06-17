package net.darkz.featherapi.entrypoint;

//? if forge {

/*import net.darkz.featherapi.client.FeatherAPIClient;
import net.darkz.featherapi.modmenu.*;
import net.minecraftforge.fml.ModLoadingContext;

public class FeatherAPIForgeClientEntrypoint {

	public static void onInitializeClient() {
		FeatherAPIClient.onInitializeClient();
		TestFeatherAPIModMenuIntegration integration = new TestFeatherAPIModMenuIntegration();
		integration.register(ModLoadingContext.get().getActiveContainer());
	}

}

*///?}

