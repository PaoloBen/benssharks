package net.mcreator.sharks.procedures;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.sharks.network.BenssharksModVariables;
import net.mcreator.sharks.init.BenssharksModMobEffects;

public class FrenzyEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double SwimSpeed = 0;
		double KBRes = 0;
		BenssharksModVariables.MapVariables.get(world).SwimSpeed = entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(ForgeMod.SWIM_SPEED.get())
				? _livingEntity0.getAttribute(ForgeMod.SWIM_SPEED.get()).getBaseValue()
				: 0;
		BenssharksModVariables.MapVariables.get(world).syncData(world);
		BenssharksModVariables.MapVariables.get(world).KBRes = entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.KNOCKBACK_RESISTANCE)
				? _livingEntity1.getAttribute(Attributes.KNOCKBACK_RESISTANCE).getBaseValue()
				: 0;
		BenssharksModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(ForgeMod.SWIM_SPEED.get()))
			_livingEntity4.getAttribute(ForgeMod.SWIM_SPEED.get())
					.setBaseValue(((entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(ForgeMod.SWIM_SPEED.get()) ? _livingEntity2.getAttribute(ForgeMod.SWIM_SPEED.get()).getBaseValue() : 0)
							+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(BenssharksModMobEffects.FRENZY.get()) ? _livEnt.getEffect(BenssharksModMobEffects.FRENZY.get()).getAmplifier() : 0) * 2));
		if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.KNOCKBACK_RESISTANCE))
			_livingEntity7.getAttribute(Attributes.KNOCKBACK_RESISTANCE)
					.setBaseValue(((entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.KNOCKBACK_RESISTANCE) ? _livingEntity5.getAttribute(Attributes.KNOCKBACK_RESISTANCE).getBaseValue() : 0)
							+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(BenssharksModMobEffects.FRENZY.get()) ? _livEnt.getEffect(BenssharksModMobEffects.FRENZY.get()).getAmplifier() : 0) * 2));
	}
}
