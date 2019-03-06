package de.haveachin.contentplus.item;

import de.haveachin.contentplus.creativetab.ModCreativeTabs;
import de.haveachin.core.block.Block;
import de.haveachin.core.item.Item;

public class ModItems
{
	public static net.minecraft.item.Item TEST_ITEM;
	
	public static void init()
	{
		TEST_ITEM = new Item("test_item", ModCreativeTabs.CONTENT_PLUS);
	}
}
