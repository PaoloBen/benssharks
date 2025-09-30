package net.mcreator.sharks.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.sharks.init.BenssharksModMobEffects;
import net.mcreator.sharks.entity.WhitetipSharkEntity;
import net.mcreator.sharks.entity.MegalodonEntity;
import net.mcreator.sharks.entity.BullSharkEntity;

import java.util.List;
import java.util.Comparator;

public class PreyOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((!(entity instanceof BullSharkEntity) || !(entity instanceof MegalodonEntity) || !(entity instanceof WhitetipSharkEntity)) && entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(BenssharksModMobEffects.PREY.get())
				&& !(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if ((entityiterator instanceof BullSharkEntity || entityiterator instanceof MegalodonEntity || entityiterator instanceof WhitetipSharkEntity) && !(entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
						if (!((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
							if (entityiterator instanceof Mob _entity && entity instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
						} else if (Math.sqrt(Math.pow(entityiterator.getX() - entity.getX(), 2) + Math.pow(entityiterator.getY() - entity.getY(), 2) + Math.pow(entityiterator.getZ() - entity.getZ(), 2)) < Math
								.sqrt(Math.pow(entityiterator.getX() - (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2)
										+ Math.pow(entityiterator.getY() - (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
										+ Math.pow(entityiterator.getZ() - (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2))) {
							if (entityiterator instanceof Mob _entity && entity instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
						}
					}
				}
			}
		}
	}
}
