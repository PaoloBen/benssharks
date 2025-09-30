package net.mcreator.sharks.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sharks.init.BenssharksModBlockEntities;
import net.mcreator.sharks.block.renderer.SharkPlushieTileRenderer;
import net.mcreator.sharks.block.renderer.LandMineTileRenderer;
import net.mcreator.sharks.block.renderer.LandMinePrimedTileRenderer;
import net.mcreator.sharks.BenssharksMod;

@Mod.EventBusSubscriber(modid = BenssharksMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(BenssharksModBlockEntities.LAND_MINE.get(), context -> new LandMineTileRenderer());
		event.registerBlockEntityRenderer(BenssharksModBlockEntities.SHARK_PLUSH_BLOCK.get(), context -> new SharkPlushieTileRenderer());
		event.registerBlockEntityRenderer(BenssharksModBlockEntities.LAND_MINE_PRIMED.get(), context -> new LandMinePrimedTileRenderer());
	}
}
