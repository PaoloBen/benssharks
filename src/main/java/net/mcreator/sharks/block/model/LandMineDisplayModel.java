package net.mcreator.sharks.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.block.display.LandMineDisplayItem;

public class LandMineDisplayModel extends GeoModel<LandMineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LandMineDisplayItem animatable) {
		return new ResourceLocation("benssharks", "animations/landmine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LandMineDisplayItem animatable) {
		return new ResourceLocation("benssharks", "geo/landmine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LandMineDisplayItem entity) {
		return new ResourceLocation("benssharks", "textures/block/landminedefault.png");
	}
}
