package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.CookiecutterSharkEntity;

public class CookiecutterSharkModel extends GeoModel<CookiecutterSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(CookiecutterSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/cookiecutter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CookiecutterSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/cookiecutter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CookiecutterSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
