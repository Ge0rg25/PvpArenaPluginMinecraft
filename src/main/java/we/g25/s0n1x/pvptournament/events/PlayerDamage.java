package we.g25.s0n1x.pvptournament.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import we.g25.s0n1x.pvptournament.PvPTournament;

public class PlayerDamage implements Listener {

    final PvPTournament plugin;

    public PlayerDamage(PvPTournament plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public boolean onDamage(EntityDamageByEntityEvent e){
        if (plugin.permsCheckForEvents.checkValidDamagerAndRecipient(e.getDamager(), e.getEntity())) return true;//entity - живое существо

        return false;
    }

}
