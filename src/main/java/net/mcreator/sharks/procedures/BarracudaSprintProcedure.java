package net.mcreator.sharks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.Salmon;
import net.minecraft.world.entity.animal.Pufferfish;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.GlowSquid;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.sharks.init.BenssharksModMobEffects;
import net.mcreator.sharks.entity.WhitetipSharkEntity;
import net.mcreator.sharks.entity.TigerSharkEntity;
import net.mcreator.sharks.entity.ShrakEntity;
import net.mcreator.sharks.entity.RemoraEntity;
import net.mcreator.sharks.entity.PilotFishEntity;
import net.mcreator.sharks.entity.MakoSharkEntity;
import net.mcreator.sharks.entity.LemonSharkEntity;
import net.mcreator.sharks.entity.GreaterAxodileEntity;
import net.mcreator.sharks.entity.BullSharkEntity;
import net.mcreator.sharks.entity.BlueSharkEntity;
import net.mcreator.sharks.entity.BarracudaEntity;
import net.mcreator.sharks.entity.AxodileEntity;
import net.mcreator.sharks.BenssharksMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BarracudaSprintProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BarracudaEntity) {
			if (entity.isInWaterOrBubble()) {
				if (!world.getEntitiesOfClass(MakoSharkEntity.class, AABB.ofSize(new Vec3(x, y, z), 12, 12, 12), e -> true).isEmpty() || !world.getEntitiesOfClass(PilotFishEntity.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(RemoraEntity.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(TropicalFish.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty() || !world.getEntitiesOfClass(Pufferfish.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(Cod.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty() || !world.getEntitiesOfClass(Salmon.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(Chicken.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty() || !world.getEntitiesOfClass(TigerSharkEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(BullSharkEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty() || !world.getEntitiesOfClass(AxodileEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(WhitetipSharkEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(GreaterAxodileEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(LemonSharkEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty() || !world.getEntitiesOfClass(GlowSquid.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(Squid.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty() || !world.getEntitiesOfClass(ShrakEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(BlueSharkEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()
						|| (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player && !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()
								&& !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player _plr ? _plr.getAbilities().instabuild : false)
								&& (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isInWaterOrBubble()) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(BenssharksModMobEffects.FRENZY.get(), 60, 2, true, false));
					if (entity instanceof BarracudaEntity) {
						((BarracudaEntity) entity).setAnimation("sprint");
					}
					BenssharksMod.queueServerWork(60, () -> {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(BenssharksModMobEffects.FRENZY.get());
					});
				} else {
					if (entity instanceof BarracudaEntity) {
						((BarracudaEntity) entity).setAnimation("empty");
					}
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(BenssharksModMobEffects.FRENZY.get());
				}
			}
		}
	}
}
