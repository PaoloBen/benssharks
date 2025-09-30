package net.mcreator.sharks.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.block.display.SharkPlushieDisplayItem;

public class SharkPlushieDisplayModel extends GeoModel<SharkPlushieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SharkPlushieDisplayItem animatable) {
		return new ResourceLocation("benssharks", "animations/blahaj.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SharkPlushieDisplayItem animatable) {
		return new ResourceLocation("benssharks", "geo/blahaj.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SharkPlushieDisplayItem entity) {
		return new ResourceLocation("benssharks", "textures/block/blahaj.png");
	}
}
