package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.BullSharkEntity;

public class BullSharkModel extends GeoModel<BullSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(BullSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/bull_shark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BullSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/bull_shark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BullSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
