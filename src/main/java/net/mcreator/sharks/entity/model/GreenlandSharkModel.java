package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.GreenlandSharkEntity;

public class GreenlandSharkModel extends GeoModel<GreenlandSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(GreenlandSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/greenlandshark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GreenlandSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/greenlandshark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GreenlandSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
