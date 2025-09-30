package net.mcreator.sharks.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.sharks.init.BenssharksModMobEffects;
import net.mcreator.sharks.entity.LandSharkEntity;

public class LandSharkOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		if (entity.isShiftKeyDown()) {
			if (entity instanceof LandSharkEntity) {
				((LandSharkEntity) entity).setAnimation("sit");
			}
		} else if (!entity.isShiftKeyDown()) {
			if (entity instanceof LandSharkEntity) {
				((LandSharkEntity) entity).setAnimation("empty");
			}
		}
		if (entity instanceof LandSharkEntity && entity.isInWaterOrBubble()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(BenssharksModMobEffects.FRENZY.get(), 20, 3, true, false));
			if (entity instanceof LandSharkEntity) {
				((LandSharkEntity) entity).setAnimation("swim");
			}
		} else if (entity instanceof LandSharkEntity && !entity.isInWaterOrBubble()) {
			if (entity instanceof LandSharkEntity) {
				((LandSharkEntity) entity).setAnimation("empty");
			}
		}
	}
}
