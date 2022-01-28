package dograffe.chesthead.chestyhead.Listeners;

import com.Acrobot.Breeze.Utils.InventoryUtil;
import com.Acrobot.ChestShop.Events.PreTransactionEvent;
import com.Acrobot.ChestShop.Events.TransactionEvent;
import dograffe.chesthead.chestyhead.ChestyHead;
import dograffe.chesthead.chestyhead.HeadSwapper;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class HeadTransactionListener implements Listener
{
    @EventHandler
    public void onHeadTransaction(TransactionEvent e)
    {
        if(e.getSign().getLine(3).equals("Player Head"))
        {
            new Thread(() ->
            {
                try {
                    HeadSwapper SwapHead = new HeadSwapper(e.getClient());
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }).start();
        }

    }


}
