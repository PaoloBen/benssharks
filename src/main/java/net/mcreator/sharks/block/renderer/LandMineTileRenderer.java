package net.mcreator.sharks.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sharks.block.model.LandMineBlockModel;
import net.mcreator.sharks.block.entity.LandMineTileEntity;

public class LandMineTileRenderer extends GeoBlockRenderer<LandMineTileEntity> {
	public LandMineTileRenderer() {
		super(new LandMineBlockModel());
	}

	@Override
	public RenderType getRenderType(LandMineTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
