package net.mcreator.sharks.procedures;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.sharks.network.BenssharksModVariables;

public class FrenzyEffectExpiresProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double SwimSpeed = 0;
		double KBRes = 0;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(ForgeMod.SWIM_SPEED.get()))
			_livingEntity0.getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(BenssharksModVariables.MapVariables.get(world).SwimSpeed);
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.KNOCKBACK_RESISTANCE))
			_livingEntity1.getAttribute(Attributes.KNOCKBACK_RESISTANCE).setBaseValue(BenssharksModVariables.MapVariables.get(world).KBRes);
	}
}
