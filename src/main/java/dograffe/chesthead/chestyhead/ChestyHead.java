package dograffe.chesthead.chestyhead;

import com.Acrobot.ChestShop.Plugins.ChestShop;
import dograffe.chesthead.chestyhead.Listeners.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChestyHead extends JavaPlugin {
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new HeadTransactionListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
