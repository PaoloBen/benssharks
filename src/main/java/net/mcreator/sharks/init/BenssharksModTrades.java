
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.sharks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BenssharksModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.SHEPHERD) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 29),

					new ItemStack(BenssharksModBlocks.SHARK_PLUSH_BLOCK.get()), 10, 10, 0.05f));
		}
	}
}
