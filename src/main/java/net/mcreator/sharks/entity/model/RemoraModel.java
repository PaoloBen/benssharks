package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.RemoraEntity;

public class RemoraModel extends GeoModel<RemoraEntity> {
	@Override
	public ResourceLocation getAnimationResource(RemoraEntity entity) {
		return new ResourceLocation("benssharks", "animations/remora.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RemoraEntity entity) {
		return new ResourceLocation("benssharks", "geo/remora.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RemoraEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
