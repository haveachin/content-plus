package de.haveachin.contentplus.event;

import org.jline.utils.Log;

import de.haveachin.contentplus.Main;
import de.haveachin.contentplus.item.ModItems;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class OverrideCow
{
	public static ResourceLocation ENTITIES_COW;
	
	public static void init()
	{
		ENTITIES_COW = LootTableList.register(new ResourceLocation(Main.MODID, "entities/cow"));
	}
	
    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event)
    {
        if(!event.getName().equals(LootTableList.ENTITIES_COW))
        	return;
        
        event.setTable(event.getLootTableManager().getLootTableFromLocation(ENTITIES_COW));
    }
}
