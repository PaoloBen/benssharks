
package net.mcreator.sharks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MegalodonToothItem extends Item {
	public MegalodonToothItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
