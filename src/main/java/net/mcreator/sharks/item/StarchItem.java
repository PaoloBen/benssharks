
package net.mcreator.sharks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StarchItem extends Item {
	public StarchItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
