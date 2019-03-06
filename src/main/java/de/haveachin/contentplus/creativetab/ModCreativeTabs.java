package de.haveachin.contentplus.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {
	public static final CreativeTabs CONTENT_PLUS = new CreativeTabs("tabContentPlus")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(Items.BLAZE_POWDER);
		}
		
		@Override
		public boolean hasSearchBar()
		{
			return true;
		}
	}.setBackgroundImageName("item_search.png");
}
