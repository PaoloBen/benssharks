
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sharks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.sharks.block.entity.SharkPlushieTileEntity;
import net.mcreator.sharks.block.entity.LandMineTileEntity;
import net.mcreator.sharks.block.entity.LandMinePrimedTileEntity;
import net.mcreator.sharks.BenssharksMod;

public class BenssharksModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BenssharksMod.MODID);
	public static final RegistryObject<BlockEntityType<LandMineTileEntity>> LAND_MINE = REGISTRY.register("land_mine", () -> BlockEntityType.Builder.of(LandMineTileEntity::new, BenssharksModBlocks.LAND_MINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<SharkPlushieTileEntity>> SHARK_PLUSH_BLOCK = REGISTRY.register("shark_plush_block",
			() -> BlockEntityType.Builder.of(SharkPlushieTileEntity::new, BenssharksModBlocks.SHARK_PLUSH_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<LandMinePrimedTileEntity>> LAND_MINE_PRIMED = REGISTRY.register("land_mine_primed",
			() -> BlockEntityType.Builder.of(LandMinePrimedTileEntity::new, BenssharksModBlocks.LAND_MINE_PRIMED.get()).build(null));

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
