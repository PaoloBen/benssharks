package net.mcreator.sharks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.sharks.init.BenssharksModMobEffects;

public class DryoutEffectOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isInWaterRainOrBubble()) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.DRY_OUT)), 1);
		} else if (entity.isInWaterRainOrBubble()) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(BenssharksModMobEffects.DRYOUT_EFFECT.get());
		}
	}
}
