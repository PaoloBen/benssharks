package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.ThalassogerEntity;

public class ThalassogerModel extends GeoModel<ThalassogerEntity> {
	@Override
	public ResourceLocation getAnimationResource(ThalassogerEntity entity) {
		return new ResourceLocation("benssharks", "animations/thalassoger.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ThalassogerEntity entity) {
		return new ResourceLocation("benssharks", "geo/thalassoger.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ThalassogerEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ThalassogerEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
