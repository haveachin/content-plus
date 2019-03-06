package de.haveachin.contentplus.block;

import de.haveachin.contentplus.creativetab.ModCreativeTabs;
import de.haveachin.contentplus.item.ModItems;
import de.haveachin.core.block.ore.*;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static net.minecraft.block.Block TEST_BLOCK;
	
	public static void init()
	{
		TEST_BLOCK = new Ore("test_block", Material.ROCK, new Drop(ModItems.TEST_ITEM, 1, 5), ModCreativeTabs.CONTENT_PLUS);
		TEST_BLOCK.setHarvestLevel("pickaxe", 0);
		TEST_BLOCK.setHardness(3);
	}
}
