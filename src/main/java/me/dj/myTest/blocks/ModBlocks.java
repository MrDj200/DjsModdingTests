package me.dj.myTest.blocks;

import me.dj.myTest.MyTest;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 *
 * @author Dj
 */
public class ModBlocks 
{
    @GameRegistry.ObjectHolder(MyTest.MODID + ":firstblock")
    public static FirstBlock firstBlock;
}
