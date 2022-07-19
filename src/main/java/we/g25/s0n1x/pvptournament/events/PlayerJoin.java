package we.g25.s0n1x.pvptournament.events;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import we.g25.s0n1x.pvptournament.PvPTournament;

public class PlayerJoin implements Listener {

    final PvPTournament plugin;

    public PlayerJoin(PvPTournament plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        FileConfiguration config = plugin.getConfig();

        plugin.all_players.add(event.getPlayer());

        if (plugin.isPlaying()){
            return;
        }

        if (plugin.all_players.size() >= config.getInt("MinPlayersToStart")){
            // TODO Game starting logic
        }
    }
}
