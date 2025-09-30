package net.mcreator.sharks.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.block.entity.LandMineTileEntity;

public class LandMineBlockModel extends GeoModel<LandMineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LandMineTileEntity animatable) {
		return new ResourceLocation("benssharks", "animations/landmine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LandMineTileEntity animatable) {
		return new ResourceLocation("benssharks", "geo/landmine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LandMineTileEntity animatable) {
		return new ResourceLocation("benssharks", "textures/block/landminedefault.png");
	}
}
