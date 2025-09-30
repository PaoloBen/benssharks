package net.mcreator.sharks.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sharks.entity.RollParticleEntity;

public class RollParticleModel extends GeoModel<RollParticleEntity> {
	@Override
	public ResourceLocation getAnimationResource(RollParticleEntity entity) {
		return new ResourceLocation("benssharks", "animations/roll_particle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RollParticleEntity entity) {
		return new ResourceLocation("benssharks", "geo/roll_particle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RollParticleEntity entity) {
		return new ResourceLocation("benssharks", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(RollParticleEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
