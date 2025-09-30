package net.mcreator.sharks.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sharks.block.model.SharkPlushieDisplayModel;
import net.mcreator.sharks.block.display.SharkPlushieDisplayItem;

public class SharkPlushieDisplayItemRenderer extends GeoItemRenderer<SharkPlushieDisplayItem> {
	public SharkPlushieDisplayItemRenderer() {
		super(new SharkPlushieDisplayModel());
	}

	@Override
	public RenderType getRenderType(SharkPlushieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
