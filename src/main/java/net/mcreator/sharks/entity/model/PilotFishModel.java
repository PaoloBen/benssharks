package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.PilotFishEntity;

public class PilotFishModel extends GeoModel<PilotFishEntity> {
	@Override
	public ResourceLocation getAnimationResource(PilotFishEntity entity) {
		return new ResourceLocation("benssharks", "animations/pilot_fish.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PilotFishEntity entity) {
		return new ResourceLocation("benssharks", "geo/pilot_fish.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PilotFishEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
