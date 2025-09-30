
package net.mcreator.sharks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MutatedEggItem extends Item {
	public MutatedEggItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}
}
