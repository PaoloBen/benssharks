package net.mcreator.sharks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.sharks.entity.AxodileEntity;
import net.mcreator.sharks.BenssharksMod;

public class AxodileOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double velocityX = 0;
		double velocityY = 0;
		double velocityZ = 0;
		if (entity instanceof AxodileEntity) {
			velocityY = entity.getDeltaMovement().y();
			if (velocityY > 0 && !entity.isInWaterOrBubble()) {
				if (entity instanceof AxodileEntity) {
					((AxodileEntity) entity).setAnimation("landjump");
				}
			} else if (velocityY == 0 && !entity.isInWaterOrBubble()) {
				if (entity instanceof AxodileEntity) {
					((AxodileEntity) entity).setAnimation("idle_land");
				}
			}
		}
		if (entity instanceof AxodileEntity) {
			if (entity.isUnderWater() && world.isEmptyBlock(BlockPos.containing(x, y + 1, z))
					&& (!world.getBlockState(BlockPos.containing(x, y - 2, z)).canOcclude() || !(world.getBlockState(BlockPos.containing(x, y - 2, z))).is(BlockTags.create(new ResourceLocation("minecraft:ice")))
							|| !(world.getBlockState(BlockPos.containing(x, y - 2, z))).is(BlockTags.create(new ResourceLocation("minecraft:glass"))))) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 1, (entity.getDeltaMovement().z())));
				if (entity instanceof AxodileEntity) {
					((AxodileEntity) entity).setAnimation("landjump");
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dolphin.jump")), SoundSource.BLOCKS, (float) 0.25, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dolphin.jump")), SoundSource.BLOCKS, (float) 0.25, 1, false);
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.ICE || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.FROSTED_ICE) {
			world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:ice")))) {
			world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
			entity.setDeltaMovement(new Vec3(0, 1, 0));
			BenssharksMod.queueServerWork((int) 2.5, () -> {
				entity.setDeltaMovement(new Vec3(0, 0, 0));
			});
		}
	}
}
