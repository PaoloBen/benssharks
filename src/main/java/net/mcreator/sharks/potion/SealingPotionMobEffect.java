
package net.mcreator.sharks.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.sharks.procedures.SealingPotionOnEffectActiveTickProcedure;

public class SealingPotionMobEffect extends MobEffect {
	public SealingPotionMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3230104);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SealingPotionOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
