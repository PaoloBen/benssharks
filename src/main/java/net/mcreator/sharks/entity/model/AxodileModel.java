package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.AxodileEntity;

public class AxodileModel extends GeoModel<AxodileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AxodileEntity entity) {
		return new ResourceLocation("benssharks", "animations/axodile.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AxodileEntity entity) {
		return new ResourceLocation("benssharks", "geo/axodile.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AxodileEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(AxodileEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
