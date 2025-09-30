package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.ShrakEntity;

public class ShrakModel extends GeoModel<ShrakEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShrakEntity entity) {
		return new ResourceLocation("benssharks", "animations/greatwhite.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShrakEntity entity) {
		return new ResourceLocation("benssharks", "geo/greatwhite.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShrakEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
