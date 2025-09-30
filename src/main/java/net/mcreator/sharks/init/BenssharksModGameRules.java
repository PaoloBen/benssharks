
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sharks.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BenssharksModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> AGGRESSIVE_SHARKS = GameRules.register("aggressiveSharks", GameRules.Category.MOBS, GameRules.BooleanValue.create(false));
}
