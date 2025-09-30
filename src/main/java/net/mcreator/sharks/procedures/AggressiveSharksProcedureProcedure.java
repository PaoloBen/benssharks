package net.mcreator.sharks.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.sharks.init.BenssharksModGameRules;

public class AggressiveSharksProcedureProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(BenssharksModGameRules.AGGRESSIVE_SHARKS) == false) {
			return false;
		}
		return true;
	}
}
