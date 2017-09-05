package me.dj.myTest;

import me.dj.myTest.common.CommonProxy;
import me.dj.myTest.utils.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/**
 *
 * @author Dj
 */

@Mod(modid = MyTest.MODID, name = MyTest.NAME, version = MyTest.VERSION)
public class MyTest 
{
    public static final String MODID = "djstests";
    public static final String VERSION = "0.1";
    public static final String NAME = "Dj's TestMod";
    
    @SidedProxy(clientSide = "me.dj.myTest.client.ClientProxy", serverSide = "me.dj.myTest.common.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    void preInit( FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        LogHelper.info("[Dj Info] I'm in preInit now :)");
    }
    
    @EventHandler
    void init( FMLInitializationEvent event )
    {
        proxy.init(event);
        LogHelper.info("[Dj Info] I'm in init now :)");
    }   
    
    @EventHandler
    void postInit( FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
        LogHelper.info("[Dj Info] I'm in postInit now :)");
    }
    
    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) 
    {
    }
}
