package we.g25.s0n1x.pvptournament.events;


import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import we.g25.s0n1x.pvptournament.PvPTournament;

import java.util.Objects;

public class PlayerDamage implements Listener {

    final PvPTournament plugin;

    public PlayerDamage(PvPTournament plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public boolean onDamage(EntityDamageByEntityEvent e){
        if (plugin.permsCheckForEvents.checkValidDamagerAndRecipient(e.getDamager(), e.getEntity())) return true;

        Player killer = (Player) e.getDamager();
        Player killed = (Player) e.getEntity();

        if(killed.getHealth() <= 0){
            FileConfiguration config = plugin.getConfig();
            killer.sendTitle(config.getString("titleToKiller.title"), config.getString("titleToKiller.subtitle"), 30, 80, 30);
            killed.teleport(new Location(Bukkit.getWorld(Objects.requireNonNull(config.getString("nabludpunkt.world"))), config.getInt("nabludpunkt.x"), config.getInt("nabludpunkt.y"), config.getInt("nabludpunkt.z")));
            killer.teleport(new Location(Bukkit.getWorld(Objects.requireNonNull(config.getString("nabludpunkt.world"))), config.getInt("nabludpunkt.x"), config.getInt("nabludpunkt.y"), config.getInt("nabludpunkt.z")));
            e.setCancelled(true);
        }



        return false;
    }

}
