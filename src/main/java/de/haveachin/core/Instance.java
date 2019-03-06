package de.haveachin.core;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public final class Instance
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BLOCKS.toArray(new Block[0]));
		System.out.println("Registered " + BLOCKS.size() + " block(s)");
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
		System.out.println("Registered " + ITEMS.size() + " item(s)");
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event)
	{
		for (Block block : BLOCKS)
			registerRender(Item.getItemFromBlock(block));
		
		for (Item item : ITEMS)
			registerRender(item);
		
		System.out.println("Registered " + (BLOCKS.size() + ITEMS.size()) + " renderers");
	}
	
	public static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
