package dograffe.chesthead.chestyhead.Listeners;

import com.Acrobot.ChestShop.Events.ItemParseEvent;
import com.Acrobot.ChestShop.Events.MaterialParseEvent;
import com.Acrobot.ChestShop.Events.PreShopCreationEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class HeadListener implements Listener
{
    @EventHandler
    public void onMaterialParse(PreShopCreationEvent e)
    {
        if(e.getSignLines()[3].equals("YourHead"))
        {
            byte lastline = 3;

            e.setOutcome(PreShopCreationEvent.CreationOutcome.SHOP_CREATED_SUCCESSFULLY);
            e.setSignLine(lastline, "YourHead");
        }
    }
}
