package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.WhitetipSharkEntity;

public class WhitetipSharkModel extends GeoModel<WhitetipSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(WhitetipSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/whitetip.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WhitetipSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/whitetip.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WhitetipSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
