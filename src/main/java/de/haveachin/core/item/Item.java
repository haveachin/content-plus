package de.haveachin.core.item;

import java.util.ArrayList;
import java.util.List;

import de.haveachin.core.Instance;
import de.haveachin.core.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class Item extends net.minecraft.item.Item
{
	public Item(String name, CreativeTabs creativeTab)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(creativeTab);
		
		Instance.ITEMS.add(this);
	}
}
