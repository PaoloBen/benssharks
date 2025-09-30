package net.mcreator.sharks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class WaterSwimProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if (entity.isInWaterRainOrBubble() || entity.isSwimming() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) {
			return true;
		}
		return false;
	}
}
