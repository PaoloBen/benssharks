package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.BonnetheadSharkEntity;

public class BonnetheadSharkModel extends GeoModel<BonnetheadSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnetheadSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/bonnethead_shark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnetheadSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/bonnethead_shark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnetheadSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
