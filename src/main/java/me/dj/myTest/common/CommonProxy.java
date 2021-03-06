package me.dj.myTest.common;

import me.dj.myTest.blocks.FirstBlock;
import me.dj.myTest.blocks.ModBlocks;
import me.dj.myTest.utils.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 * @author Dj
 */
@Mod.EventBusSubscriber
public class CommonProxy 
{
    public void preInit(FMLPreInitializationEvent event) 
    {
        
    }
    
    public void init(FMLInitializationEvent event) 
    {
        MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());
    }
    
    public void postInit(FMLPostInitializationEvent event) 
    {
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new FirstBlock());
        LogHelper.info("Registered new Block: FirstBlock");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.firstBlock).setRegistryName(ModBlocks.firstBlock.getRegistryName()));
    }
    
}
