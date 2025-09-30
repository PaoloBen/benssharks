package net.mcreator.sharks.procedures;

import net.minecraft.world.entity.Entity;

public class JawsOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isSwimming() || entity.isUnderWater()) {
			entity.setAirSupply(300);
		}
	}
}
