package net.mcreator.sharks.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.sharks.entity.MegalodonEntity;

public class MegalodonEntityDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof MegalodonEntity) {
			((MegalodonEntity) entity).setAnimation("death");
		}
	}
}
