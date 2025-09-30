package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.MakoSharkEntity;

public class MakoSharkModel extends GeoModel<MakoSharkEntity> {
	@Override
	public ResourceLocation getAnimationResource(MakoSharkEntity entity) {
		return new ResourceLocation("benssharks", "animations/makoshark.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MakoSharkEntity entity) {
		return new ResourceLocation("benssharks", "geo/makoshark.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MakoSharkEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
