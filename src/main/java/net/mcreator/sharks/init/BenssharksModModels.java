
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sharks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sharks.client.model.Modelunknown;
import net.mcreator.sharks.client.model.ModelSeekingArrow;
import net.mcreator.sharks.client.model.ModelJaggedArmorJava;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BenssharksModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSeekingArrow.LAYER_LOCATION, ModelSeekingArrow::createBodyLayer);
		event.registerLayerDefinition(ModelJaggedArmorJava.LAYER_LOCATION, ModelJaggedArmorJava::createBodyLayer);
		event.registerLayerDefinition(Modelunknown.LAYER_LOCATION, Modelunknown::createBodyLayer);
	}
}
