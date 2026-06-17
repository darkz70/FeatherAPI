package net.darkz.featherapi.entrypoint;

//? if forge {
/*import net.darkz.featherapi.FeatherAPI;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;

@Mod(FeatherAPI.MOD_ID)
public class FeatherAPIForgeEntrypoint {

	public FeatherAPIForgeEntrypoint() {
		FeatherAPI.onInitialize();
		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> FeatherAPIForgeClientEntrypoint::onInitializeClient);
	}

}

*///?}
