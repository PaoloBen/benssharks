package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.BarracudaEntity;

public class BarracudaModel extends GeoModel<BarracudaEntity> {
	@Override
	public ResourceLocation getAnimationResource(BarracudaEntity entity) {
		return new ResourceLocation("benssharks", "animations/barracuda.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarracudaEntity entity) {
		return new ResourceLocation("benssharks", "geo/barracuda.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarracudaEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
