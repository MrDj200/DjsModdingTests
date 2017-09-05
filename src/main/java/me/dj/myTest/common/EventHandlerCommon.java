package me.dj.myTest.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 * @author Dj
 */
public class EventHandlerCommon 
{
    @SubscribeEvent
    public void onBlockRightClick(RightClickBlock e)
    {        
        BlockPos test = e.getPos();

        if(e.getWorld().isRemote)
        {
            return;
        }

        ItemStack itemInHand = e.getItemStack();
        String itemInHandName = itemInHand.getItem().getUnlocalizedName();
        String tmpMsg = "";

        if( itemInHandName.equals("tile.air") || e.getHand() == EnumHand.OFF_HAND)
             return;

        if( e.getHand() == EnumHand.MAIN_HAND )
        {
            tmpMsg = "MAIN";
        }else{
            tmpMsg = "OFF";
        }        
        //e.getEntityPlayer().sendMessage(new TextComponentString(itemInHandName));
        e.getEntityPlayer().sendMessage(new TextComponentString("------------------"));
        if( itemInHandName.equals("item.appliedenergistics2.nether_quartz_wrench") || itemInHandName.equals("item.appliedenergistics2.certus_quartz_wrench") )
        {
            e.getEntityPlayer().sendMessage(new TextComponentString("[" + e.getSide() + "] Yep! " + tmpMsg));
            e.getEntityPlayer().sendMessage(new TextComponentString(e.getWorld().getBlockState(test).getBlock().getLocalizedName()));
        }else{
            e.getEntityPlayer().sendMessage(new TextComponentString("Spider! " + tmpMsg));
        }
    }


    @SubscribeEvent
    public void test(PlaceEvent e)
    {
        e.getPlayer().sendMessage(new TextComponentString("You Placed: " + e.getPlacedBlock().getBlock().getUnlocalizedName()));
    }

    //  Invicibility, boy :3
    @SubscribeEvent
    public void onEntityGetHurt(LivingHurtEvent e)
    {        
        if (e.getEntity() instanceof EntityPlayer)
        {
            e.setCanceled(true);
        }            
      }
}
