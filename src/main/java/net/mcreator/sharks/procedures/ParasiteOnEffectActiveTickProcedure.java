package net.mcreator.sharks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.sharks.init.BenssharksModMobEffects;
import net.mcreator.sharks.entity.CookiecutterSharkEntity;

public class ParasiteOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof CookiecutterSharkEntity) && !(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) && !(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(BenssharksModMobEffects.SEALING.get()))) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC_KILL)), (float) 0.125);
		}
	}
}
