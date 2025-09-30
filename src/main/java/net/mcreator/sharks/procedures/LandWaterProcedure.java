package net.mcreator.sharks.procedures;

import net.minecraft.world.entity.Entity;

public class LandWaterProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.isInWaterOrBubble()) {
			return true;
		}
		return false;
	}
}
