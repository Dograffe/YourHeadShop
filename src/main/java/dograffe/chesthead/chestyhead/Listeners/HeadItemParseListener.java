package dograffe.chesthead.chestyhead.Listeners;

import com.Acrobot.ChestShop.Events.ItemParseEvent;
import com.Acrobot.ChestShop.Events.PreShopCreationEvent;
import com.Acrobot.ChestShop.Events.ShopCreatedEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.event.EventPriority;

public class HeadItemParseListener implements Listener
{
    public void onHeadItemParse(ItemParseEvent e)
    {
        if(e.getItemString().equals("Player Head"))
        {
            /*ItemStack skull = new ItemStack(Material.PLAYER_HEAD); // Create a new ItemStack of the Player Head type.
            SkullMeta skullMeta = (SkullMeta) skull.getItemMeta(); // Get the created item's ItemMeta and cast it to SkullMeta so we can access the skull properties
            skullMeta.setOwningPlayer(Bukkit.getPlayer("Dograffe")); // Set the skull's owner so it will adapt the skin of the provided username (case sensitive).
            skull.setItemMeta(skullMeta);*/
           ItemStack Air = new ItemStack(Material.PLAYER_HEAD);
            e.setItem(Air);

           // Bukkit.broadcastMessage("ItemParse Event Triggered");
        }
    }
}
