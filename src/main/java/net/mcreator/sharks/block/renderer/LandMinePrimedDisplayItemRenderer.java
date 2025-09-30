package net.mcreator.sharks.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sharks.block.model.LandMinePrimedDisplayModel;
import net.mcreator.sharks.block.display.LandMinePrimedDisplayItem;

public class LandMinePrimedDisplayItemRenderer extends GeoItemRenderer<LandMinePrimedDisplayItem> {
	public LandMinePrimedDisplayItemRenderer() {
		super(new LandMinePrimedDisplayModel());
	}

	@Override
	public RenderType getRenderType(LandMinePrimedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
