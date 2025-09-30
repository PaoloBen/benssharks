
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sharks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.sharks.BenssharksMod;

public class BenssharksModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, BenssharksMod.MODID);
	public static final RegistryObject<Potion> POTION_OF_SEALING = REGISTRY.register("potion_of_sealing", () -> new Potion(new MobEffectInstance(BenssharksModMobEffects.SEALING.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> FRENZY_POTION = REGISTRY.register("frenzy_potion", () -> new Potion(new MobEffectInstance(BenssharksModMobEffects.FRENZY.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> JAWS_POTION = REGISTRY.register("jaws_potion", () -> new Potion(new MobEffectInstance(BenssharksModMobEffects.JAWS.get(), 3600, 0, false, true)));
}
