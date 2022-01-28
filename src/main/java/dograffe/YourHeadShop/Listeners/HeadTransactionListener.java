package dograffe.YourHeadShop.Listeners;

import com.Acrobot.ChestShop.Events.TransactionEvent;
import dograffe.YourHeadShop.HeadSwapper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

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
