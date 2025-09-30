package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.KrillEntity;

public class KrillModel extends GeoModel<KrillEntity> {
	@Override
	public ResourceLocation getAnimationResource(KrillEntity entity) {
		return new ResourceLocation("benssharks", "animations/krill.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KrillEntity entity) {
		return new ResourceLocation("benssharks", "geo/krill.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KrillEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
