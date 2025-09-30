package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.GoblinSharkEntity;

public class GoblinSharkModel extends GeoModel<GoblinSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoblinSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/goblin_shark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoblinSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/goblin_shark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoblinSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
