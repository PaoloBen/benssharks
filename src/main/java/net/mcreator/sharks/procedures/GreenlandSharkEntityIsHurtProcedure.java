package net.mcreator.sharks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.sharks.entity.GreenlandSharkEntity;
import net.mcreator.sharks.BenssharksMod;

public class GreenlandSharkEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof GreenlandSharkEntity && entity.isInWaterOrBubble()) {
			if (entity instanceof GreenlandSharkEntity) {
				((GreenlandSharkEntity) entity).setAnimation("sprint");
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 600, 1, true, false));
			BenssharksMod.queueServerWork(600, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.DOLPHINS_GRACE);
				if (entity instanceof GreenlandSharkEntity) {
					((GreenlandSharkEntity) entity).setAnimation("empty");
				}
			});
		}
	}
}
