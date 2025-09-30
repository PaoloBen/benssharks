package net.mcreator.sharks.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.block.display.LandMinePrimedDisplayItem;

public class LandMinePrimedDisplayModel extends GeoModel<LandMinePrimedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LandMinePrimedDisplayItem animatable) {
		return new ResourceLocation("benssharks", "animations/landmineprimed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LandMinePrimedDisplayItem animatable) {
		return new ResourceLocation("benssharks", "geo/landmineprimed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LandMinePrimedDisplayItem entity) {
		return new ResourceLocation("benssharks", "textures/block/landminedefault.png");
	}
}
