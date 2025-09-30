package net.mcreator.sharks.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sharks.block.model.LandMinePrimedBlockModel;
import net.mcreator.sharks.block.entity.LandMinePrimedTileEntity;

public class LandMinePrimedTileRenderer extends GeoBlockRenderer<LandMinePrimedTileEntity> {
	public LandMinePrimedTileRenderer() {
		super(new LandMinePrimedBlockModel());
	}

	@Override
	public RenderType getRenderType(LandMinePrimedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
