package net.mcreator.sharks.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sharks.block.model.SharkPlushieBlockModel;
import net.mcreator.sharks.block.entity.SharkPlushieTileEntity;

public class SharkPlushieTileRenderer extends GeoBlockRenderer<SharkPlushieTileEntity> {
	public SharkPlushieTileRenderer() {
		super(new SharkPlushieBlockModel());
	}

	@Override
	public RenderType getRenderType(SharkPlushieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
