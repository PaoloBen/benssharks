
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sharks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.sharks.block.SharkPlushieBlock;
import net.mcreator.sharks.block.LandMinePrimedBlock;
import net.mcreator.sharks.block.LandMineBlock;
import net.mcreator.sharks.BenssharksMod;

public class BenssharksModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BenssharksMod.MODID);
	public static final RegistryObject<Block> LAND_MINE = REGISTRY.register("land_mine", () -> new LandMineBlock());
	public static final RegistryObject<Block> SHARK_PLUSH_BLOCK = REGISTRY.register("shark_plush_block", () -> new SharkPlushieBlock());
	public static final RegistryObject<Block> LAND_MINE_PRIMED = REGISTRY.register("land_mine_primed", () -> new LandMinePrimedBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
