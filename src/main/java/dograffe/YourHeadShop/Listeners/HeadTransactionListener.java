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
            new Thread(() ->                        //create Async Process
            {
                try {
                    HeadSwapper SwapHead = new HeadSwapper(e.getClient());  //swap Default Player Head given by Chest shop with client's head
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }).start();
        }

    }


}
