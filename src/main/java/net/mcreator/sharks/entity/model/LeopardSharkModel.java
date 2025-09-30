package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.LeopardSharkEntity;

public class LeopardSharkModel extends GeoModel<LeopardSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeopardSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/leopard_shark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeopardSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/leopard_shark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeopardSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
