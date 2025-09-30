package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.BaskingSharkEntity;

public class BaskingSharkModel extends GeoModel<BaskingSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(BaskingSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/baskingshark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BaskingSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/baskingshark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BaskingSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
