package me.dj.myTest.blocks;

import me.dj.myTest.MyTest;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.client.model.ModelLoader;

/**
 *
 * @author Dj
 */
public class FirstBlock extends Block
{
    public FirstBlock() 
    {
        super(Material.ROCK);
        setUnlocalizedName(MyTest.MODID + ".firstblock"); // Used for localization (en_US.lang)
        setRegistryName("firstblock");        // The unique name (within your mod) that identifies this block
    }
}
