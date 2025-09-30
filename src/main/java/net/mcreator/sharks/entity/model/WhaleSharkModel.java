package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.WhaleSharkEntity;

public class WhaleSharkModel extends GeoModel<WhaleSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(WhaleSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/whaleshark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WhaleSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/whaleshark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WhaleSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
