package de.haveachin.core.block.ore;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import de.haveachin.core.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Ore extends Block
{
	public final Drop drop;
	
	public Ore(String name)
	{
		this(name, null);
	}
	
	public Ore(String name, Drop drops)
	{
		this(name, Material.ROCK, drops);
	}
	
	public Ore(String name, Material material, Drop drops)
	{
		this(name, material, drops, CreativeTabs.BUILDING_BLOCKS);
	}
	
	public Ore(String name, Material material, CreativeTabs creativeTab)
	{
		this(name, material, null, creativeTab);
	}
	
	public Ore(String name, Material material, Drop drop, CreativeTabs creativeTab)
	{
		super(name, material, creativeTab);
		
		this.drop = drop;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		//if (drop == null || drop.item == null)
		//	return super.getItemDropped(state, rand, fortune);
		
		return drop.item;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return drop.drop();
	}
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random rand)
	{
		if (drop == null || drop.item == null)
			return drop.drop();
		
		return drop.drop(fortune);
	}
}
