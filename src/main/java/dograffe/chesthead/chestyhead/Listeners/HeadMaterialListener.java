package dograffe.chesthead.chestyhead.Listeners;

import com.Acrobot.ChestShop.Events.MaterialParseEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class HeadMaterialListener implements Listener
{
    @EventHandler
    public void onMaterialParse(MaterialParseEvent e)
    {
        if(e.getMaterialString().equals("Player Head"))
        {
            e.setMaterial(Material.PLAYER_HEAD);
           // Bukkit.broadcastMessage("MaterialParse Event Triggered");
        }


    }

}
