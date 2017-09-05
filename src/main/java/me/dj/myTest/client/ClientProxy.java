package me.dj.myTest.client;

import me.dj.myTest.MyTest;
import me.dj.myTest.blocks.ModBlocks;
import me.dj.myTest.common.CommonProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 *
 * @author Dj
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        OBJLoader.INSTANCE.addDomain(MyTest.MODID);
        registerModel(new ItemBlock(ModBlocks.firstBlock));
    }
    
    public void registerModel(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(MyTest.MODID + ":", "CNCInscriber.obj"));
    }
    
    @Override
    public void init(FMLInitializationEvent event)
    {
        
    }
    
    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
