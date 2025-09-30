package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.BlacktipReefSharkEntity;

public class BlacktipReefSharkModel extends GeoModel<BlacktipReefSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlacktipReefSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/blacktip_reef_shark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlacktipReefSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/blacktip_reef_shark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlacktipReefSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
