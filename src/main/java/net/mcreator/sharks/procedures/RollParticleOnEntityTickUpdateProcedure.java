package net.mcreator.sharks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.sharks.BenssharksMod;

public class RollParticleOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWaterOrBubble()) {
			BenssharksMod.queueServerWork(60, () -> {
				if (!entity.level().isClientSide())
					entity.discard();
			});
		}
		if (!entity.isVehicle()) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
