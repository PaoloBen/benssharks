package net.mcreator.sharks.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class LandSharkFloatProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (entity.isInWaterOrBubble() && (!((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()))).getBlock() instanceof LiquidBlock)
				|| !((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() + 1.5, entity.getZ()))).getBlock() instanceof LiquidBlock)
				|| !((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()))).getBlock() instanceof LiquidBlock))) {
			return false;
		}
		return true;
	}
}
