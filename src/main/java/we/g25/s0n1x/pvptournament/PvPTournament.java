package we.g25.s0n1x.pvptournament;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import we.g25.s0n1x.pvptournament.Other.StandartPermsCheckForCMDs;
import we.g25.s0n1x.pvptournament.Other.StandartPermsCheckForEvents;
import we.g25.s0n1x.pvptournament.events.PlayerDamage;

public final class PvPTournament extends JavaPlugin {

    public StandartPermsCheckForCMDs permsCheckForCMDs = new StandartPermsCheckForCMDs();
    public StandartPermsCheckForEvents permsCheckForEvents = new StandartPermsCheckForEvents();

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerDamage(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
