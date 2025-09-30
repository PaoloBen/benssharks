package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.MegalodonEntity;

public class MegalodonModel extends GeoModel<MegalodonEntity> {
	@Override
	public ResourceLocation getAnimationResource(MegalodonEntity entity) {
		return new ResourceLocation("benssharks", "animations/megalodon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MegalodonEntity entity) {
		return new ResourceLocation("benssharks", "geo/megalodon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MegalodonEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

}
