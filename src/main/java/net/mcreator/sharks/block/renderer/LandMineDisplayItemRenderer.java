package net.mcreator.sharks.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sharks.block.model.LandMineDisplayModel;
import net.mcreator.sharks.block.display.LandMineDisplayItem;

public class LandMineDisplayItemRenderer extends GeoItemRenderer<LandMineDisplayItem> {
	public LandMineDisplayItemRenderer() {
		super(new LandMineDisplayModel());
	}

	@Override
	public RenderType getRenderType(LandMineDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
