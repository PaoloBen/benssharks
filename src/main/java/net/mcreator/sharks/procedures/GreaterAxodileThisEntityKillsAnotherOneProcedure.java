package net.mcreator.sharks.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.sharks.entity.GreaterAxodileEntity;

public class GreaterAxodileThisEntityKillsAnotherOneProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof GreaterAxodileEntity) {
			((GreaterAxodileEntity) sourceentity).setAnimation("empty");
		}
		sourceentity.stopRiding();
	}
}
