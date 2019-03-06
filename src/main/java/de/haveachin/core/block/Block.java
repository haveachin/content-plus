package de.haveachin.core.block;

import java.util.ArrayList;
import java.util.List;

import de.haveachin.core.Instance;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class Block extends net.minecraft.block.Block
{
	public Block(String name)
	{
		this(name, Material.ROCK, CreativeTabs.BUILDING_BLOCKS);
	}
	
	public Block(String name, Material material)
	{
		this(name, material, CreativeTabs.BUILDING_BLOCKS);
	}
	
	public Block(String name, Material material, CreativeTabs creativeTab)
	{
		super(material);
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(creativeTab);
		
		Instance.BLOCKS.add(this);
		Instance.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}
}
