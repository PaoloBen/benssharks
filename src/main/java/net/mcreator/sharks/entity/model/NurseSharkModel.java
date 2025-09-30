package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.NurseSharkEntity;

public class NurseSharkModel extends GeoModel<NurseSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(NurseSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/nurse_shark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NurseSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/nurse_shark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NurseSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
