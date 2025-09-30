package net.mcreator.sharks.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.sharks.init.BenssharksModMobEffects;

public class SealingPotionOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(BenssharksModMobEffects.BLEEDING.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(BenssharksModMobEffects.PARASITE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.WITHER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.POISON);
	}
}
