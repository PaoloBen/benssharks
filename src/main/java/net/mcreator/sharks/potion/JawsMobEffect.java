
package net.mcreator.sharks.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.sharks.procedures.JawsOnEffectActiveTickProcedure;
import net.mcreator.sharks.procedures.JawsEffectExpiresProcedure;

public class JawsMobEffect extends MobEffect {
	public JawsMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -7491127);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		JawsOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		JawsEffectExpiresProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
