//~ client_fabric_commands

package net.darkz.featherapi.client.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.darkz.featherapi.FeatherAPI;
import net.darkz.featherapi.utils.CommandUtils;
import net.darkz.featherapi.utils.command.CommandTextBuilder;
import net.minecraft.network.chat.*;
import net.minecraft.network.chat.HoverEvent.*;
import net.minecraft.util.*;
import net.minecraft.*;
import net.minecraft.world.item.*;
import static net.darkz.featherapi.utils.CommandUtils.literal;

public class TestFeatherAPICommandsManager {

	public static void register(CommandDispatcher<FabricClientCommandSource> dispatcher) {
		dispatcher.register(literal(FeatherAPI.MOD_ID)
				.executes(TestFeatherAPICommandsManager::test));
	}

	// Tip: You should avoid using context.getSource()
	private static int test(CommandContext<FabricClientCommandSource> context) {
		long nanos = Util.getNanos();
		Component text = CommandTextBuilder.startBuilder("test", FeatherAPI.MOD_ID, nanos)
				.withCopyToClipboard(String.valueOf(nanos))
				.withHoverEvent(CommandTextBuilder.getHoverEvent(
						Action.SHOW_ITEM,
						//? if >=26.1 {
						new ItemStackTemplate(Items.MOSS_BLOCK)
						//?} elif >=1.21.5 {
						/*Items.MOSS_BLOCK.getDefaultInstance()
						*///?} else {
						/*new ItemStackInfo(Items.MOSS_BLOCK.getDefaultInstance())
						*///?}
				))
				.build();

		CommandUtils.sendMessage(text);
		return 1;
	}

}
