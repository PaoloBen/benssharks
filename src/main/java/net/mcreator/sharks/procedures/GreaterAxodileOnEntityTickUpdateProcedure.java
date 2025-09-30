package net.mcreator.sharks.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.sharks.init.BenssharksModMobEffects;
import net.mcreator.sharks.init.BenssharksModEntities;
import net.mcreator.sharks.entity.RollParticleEntity;
import net.mcreator.sharks.entity.GreaterAxodileEntity;
import net.mcreator.sharks.BenssharksMod;

import java.util.Comparator;

public class GreaterAxodileOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		double vx = 0;
		double vy = 0;
		double vz = 0;
		double dis = 0;
		if (entity.onGround()) {
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				entity.getPersistentData().putDouble("IA", (entity.getPersistentData().getDouble("IA") + 1));
			}
			if (entity.getPersistentData().getDouble("IA") == 20) {
				Chain = 5;
				for (int index0 = 0; index0 < (int) Chain; index0++) {
					BenssharksMod.queueServerWork((int) ChainWait, () -> {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(BenssharksModMobEffects.SEALING.get(), 20, 0, true, false));
					});
					ChainWait = ChainWait + 3;
				}
			}
			if (entity.getPersistentData().getDouble("IA") == 60) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(BenssharksModMobEffects.SEALING.get(), 20, 0, true, false));
			}
			if (entity.getPersistentData().getDouble("IA") == 180) {
				if (!entity.isInWaterOrBubble() || entity.onGround()) {
					if (entity instanceof GreaterAxodileEntity) {
						((GreaterAxodileEntity) entity).setAnimation("hideshell");
					}
					if (entity.onGround()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BenssharksModEntities.ROLL_PARTICLE.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						entity.startRiding(((Entity) world.getEntitiesOfClass(RollParticleEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 4, 4, 4), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf((entity.getX()), (entity.getY()), (entity.getZ()))).findFirst().orElse(null)));
						if (entity instanceof GreaterAxodileEntity) {
							((GreaterAxodileEntity) entity).setAnimation("roll");
						}
						BenssharksMod.queueServerWork(300, () -> {
							if (entity instanceof GreaterAxodileEntity) {
								((GreaterAxodileEntity) entity).setAnimation("empty");
							}
							entity.stopRiding();
						});
					}
				} else {
					entity.stopRiding();
					if (entity instanceof GreaterAxodileEntity) {
						((GreaterAxodileEntity) entity).setAnimation("empty");
					}
				}
			}
			if (entity.getPersistentData().getDouble("IA") == 230) {
				if (entity.isInWaterOrBubble() || entity.onGround()) {
					if (entity.isPassenger() && (entity.getVehicle()) instanceof RollParticleEntity) {
						entity.stopRiding();
					}
				}
				if (entity instanceof GreaterAxodileEntity) {
					((GreaterAxodileEntity) entity).setAnimation("empty");
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(BenssharksModMobEffects.SEALING.get(), 20, 0, true, false));
			}
			if (entity.getPersistentData().getDouble("IA") == 300) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(BenssharksModMobEffects.SEALING.get(), 20, 0, true, false));
			}
			if (entity.getPersistentData().getDouble("IA") == 360) {
				entity.getPersistentData().putDouble("IA", 0);
			}
		}
		if (entity.isInWaterOrBubble()) {
			if (entity instanceof GreaterAxodileEntity) {
				((GreaterAxodileEntity) entity).setAnimation("empty");
			}
		}
		if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() + 0.5, entity.getZ()))).is(BlockTags.create(new ResourceLocation("minecraft:ice")))) {
			world.destroyBlock(BlockPos.containing(entity.getX(), entity.getY() + 0.5, entity.getZ()), false);
		}
		if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()))).is(BlockTags.create(new ResourceLocation("minecraft:ice")))) {
			world.destroyBlock(BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), false);
		}
		if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() + 1.5, entity.getZ()))).is(BlockTags.create(new ResourceLocation("minecraft:ice")))) {
			world.destroyBlock(BlockPos.containing(entity.getX(), entity.getY() + 1.5, entity.getZ()), false);
		}
		if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()))).is(BlockTags.create(new ResourceLocation("minecraft:ice")))) {
			world.destroyBlock(BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()), false);
		}
	}
}
