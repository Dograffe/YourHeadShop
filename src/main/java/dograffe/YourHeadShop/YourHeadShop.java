package dograffe.YourHeadShop;

import dograffe.YourHeadShop.Listeners.HeadTransactionListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class YourHeadShop extends JavaPlugin {
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new HeadTransactionListener(), this);
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }
}
