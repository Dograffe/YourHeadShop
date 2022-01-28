package dograffe.chesthead.chestyhead.Listeners;

import com.Acrobot.Breeze.Utils.InventoryUtil;
import com.Acrobot.ChestShop.Events.PreTransactionEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class HeadTransactionListener implements Listener
{

    @EventHandler
    public void onHeadTransaction(PreTransactionEvent e)
    {

        if(e.getSign().getLine(3).equals("Player Head"))
        {
            ItemStack skull = new ItemStack(Material.PLAYER_HEAD); // Create a new ItemStack of the Player Head type.
            SkullMeta skullMeta = (SkullMeta) skull.getItemMeta(); // Get the created item's ItemMeta and cast it to SkullMeta so we can access the skull properties
            skullMeta.setOwningPlayer(Bukkit.getPlayer(e.getClient().getDisplayName())); // Set the skull's owner so it will adapt the skin of the provided username (case sensitive).
            skull.setItemMeta(skullMeta);
            e.getClientInventory().addItem(skull);

        }
        //Bukkit.broadcastMessage("PreTransactionEventTriggered!");

        //if(e.getStock())
    }


}
