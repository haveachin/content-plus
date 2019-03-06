package de.haveachin.contentplus;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.Logger;

import de.haveachin.contentplus.block.ModBlocks;
import de.haveachin.contentplus.event.OverrideCow;
import de.haveachin.contentplus.item.ModItems;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "contentplus";
    public static final String NAME = "Content Plus";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        ModBlocks.init();
        ModItems.init();
        OverrideCow.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {}
}
