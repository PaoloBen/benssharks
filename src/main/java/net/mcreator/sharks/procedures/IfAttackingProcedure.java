package net.mcreator.sharks.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class IfAttackingProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
			return false;
		}
		return true;
	}
}
