package net.mcreator.sharks.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.block.entity.LandMinePrimedTileEntity;

public class LandMinePrimedBlockModel extends GeoModel<LandMinePrimedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LandMinePrimedTileEntity animatable) {
		return new ResourceLocation("benssharks", "animations/landmineprimed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LandMinePrimedTileEntity animatable) {
		return new ResourceLocation("benssharks", "geo/landmineprimed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LandMinePrimedTileEntity animatable) {
		return new ResourceLocation("benssharks", "textures/block/landminedefault.png");
	}
}
