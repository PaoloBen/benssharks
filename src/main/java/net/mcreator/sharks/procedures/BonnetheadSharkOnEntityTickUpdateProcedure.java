package net.mcreator.sharks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.sharks.init.BenssharksModMobEffects;
import net.mcreator.sharks.entity.BonnetheadSharkEntity;
import net.mcreator.sharks.BenssharksMod;

public class BonnetheadSharkOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double velocityY = 0;
		if (entity instanceof BonnetheadSharkEntity && !entity.isInWaterOrBubble()) {
			BenssharksMod.queueServerWork(600, () -> {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(BenssharksModMobEffects.DRYOUT_EFFECT.get(), 600, 0, true, false));
			});
		} else if (entity.isInWaterOrBubble()) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(BenssharksModMobEffects.DRYOUT_EFFECT.get());
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TALL_SEAGRASS) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TALL_SEAGRASS && (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.TALL_SEAGRASS
					&& world.getBlockState(BlockPos.containing(x, y - 2, z)).canOcclude()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.SEAGRASS.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TALL_SEAGRASS && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				world.setBlock(BlockPos.containing(x, y, z), Blocks.SEAGRASS.defaultBlockState(), 3);
			}
		}
	}
}
