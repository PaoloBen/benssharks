package net.mcreator.sharks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.sharks.init.BenssharksModMobEffects;
import net.mcreator.sharks.entity.CookiecutterSharkEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CookieGlobalProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity && !(entity instanceof CookiecutterSharkEntity) && !(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(BenssharksModMobEffects.PARASITE.get()))
				&& !(entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(BenssharksModMobEffects.DETACHED.get()))) {
			if (sourceentity instanceof CookiecutterSharkEntity) {
				if (!(entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(BenssharksModMobEffects.PARASITE.get()))) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(BenssharksModMobEffects.PARASITE.get(), 200, 0, true, false));
					if (!sourceentity.level().isClientSide())
						sourceentity.discard();
				}
			}
		}
	}
}
