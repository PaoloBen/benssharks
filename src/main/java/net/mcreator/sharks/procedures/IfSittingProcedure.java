package net.mcreator.sharks.procedures;

import net.minecraft.world.entity.Entity;

public class IfSittingProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getBoolean("Sitting");
	}
}
