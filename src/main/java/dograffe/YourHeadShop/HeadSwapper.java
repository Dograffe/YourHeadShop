package dograffe.YourHeadShop;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import java.util.concurrent.TimeUnit;

public class HeadSwapper
{

    public HeadSwapper(Player player) throws InterruptedException
    {
        ItemStack PlayerHead = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta skullMeta = (SkullMeta) PlayerHead.getItemMeta();
        assert skullMeta != null;
        skullMeta.setOwningPlayer(Bukkit.getPlayer(player.getDisplayName()));
        PlayerHead.setItemMeta(skullMeta);  //create Skull item of given player
        TimeUnit.MILLISECONDS.sleep(10);

        for(ItemStack itemStack : player.getInventory().getContents())      //Search inventory for Default PlayerHead item given by chestshop
        {
            if(itemStack != null)
            {
                if(itemStack.getType().equals(Material.PLAYER_HEAD) && !itemStack.hasItemMeta())
                {
                    itemStack.setItemMeta(skullMeta);       //replace default PlayerHead item with client's Head
                    break;
                }
            }
        }
    }

}

