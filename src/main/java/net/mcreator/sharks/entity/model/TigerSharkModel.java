package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.TigerSharkEntity;

public class TigerSharkModel extends GeoModel<TigerSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(TigerSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/tiger_shark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TigerSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/tiger_shark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TigerSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
