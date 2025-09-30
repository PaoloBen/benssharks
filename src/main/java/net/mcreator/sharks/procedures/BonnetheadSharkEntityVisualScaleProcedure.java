package net.mcreator.sharks.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.sharks.entity.BonnetheadSharkEntity;

public class BonnetheadSharkEntityVisualScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if (entity instanceof BonnetheadSharkEntity && entity instanceof LivingEntity _livEnt1 && _livEnt1.isBaby()) {
			return 0.5;
		}
		return 1;
	}
}
