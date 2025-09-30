package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.SawsharkEntity;

public class SawsharkModel extends GeoModel<SawsharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(SawsharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/sawshark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SawsharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/sawshark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SawsharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
