package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.LemonSharkEntity;

public class LemonSharkModel extends GeoModel<LemonSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(LemonSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/lemon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LemonSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/lemon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LemonSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
