package net.mcreator.sharks.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.block.entity.SharkPlushieTileEntity;

public class SharkPlushieBlockModel extends GeoModel<SharkPlushieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SharkPlushieTileEntity animatable) {
		return new ResourceLocation("benssharks", "animations/blahaj.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SharkPlushieTileEntity animatable) {
		return new ResourceLocation("benssharks", "geo/blahaj.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SharkPlushieTileEntity animatable) {
		return new ResourceLocation("benssharks", "textures/block/blahaj.png");
	}
}
