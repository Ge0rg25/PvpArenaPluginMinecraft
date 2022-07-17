package we.g25.s0n1x.pvptournament;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import we.g25.s0n1x.pvptournament.Other.StandartPermsCheck;
import we.g25.s0n1x.pvptournament.events.PlayerDamage;

public final class PvPTournament extends JavaPlugin {

    public StandartPermsCheck permsCheck = new StandartPermsCheck();

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerDamage(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
