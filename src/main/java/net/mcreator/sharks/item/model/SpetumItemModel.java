package net.mcreator.sharks.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.item.SpetumItem;

public class SpetumItemModel extends GeoModel<SpetumItem> {
	@Override
	public ResourceLocation getAnimationResource(SpetumItem animatable) {
		return new ResourceLocation("benssharks", "animations/spetum.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpetumItem animatable) {
		return new ResourceLocation("benssharks", "geo/spetum.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpetumItem animatable) {
		return new ResourceLocation("benssharks", "textures/item/spetum.png");
	}
}
