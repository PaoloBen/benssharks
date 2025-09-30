package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.BlueSharkEntity;

public class BlueSharkModel extends GeoModel<BlueSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlueSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/blueshark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlueSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/blueshark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlueSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
