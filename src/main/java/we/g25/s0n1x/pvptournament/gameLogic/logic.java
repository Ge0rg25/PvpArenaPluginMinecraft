package we.g25.s0n1x.pvptournament.gameLogic;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import we.g25.s0n1x.pvptournament.PvPTournament;


import java.util.Objects;


public class logic {

    int i = 0;

    final PvPTournament plugin;
    public logic(PvPTournament plugin){
        this.plugin = plugin;
    }

    public void GameLogic ()
    {
        for (Player player: Bukkit.getOnlinePlayers()){
            player.sendTitle("Новый бой", null);
        }
        // TODO Debug logic
        FileConfiguration config = plugin.getConfig();
        while (plugin.all_players.size() > 1) {
            Player playerFirst = plugin.all_players.get(i);
            Player playerSecond = plugin.all_players.get(++i);
            playerFirst.teleport(new Location(Bukkit.getWorld(Objects.requireNonNull(config.getString("colba1.world"))), config.getInt("colba1.x"), config.getInt("colba1.y"), config.getInt("colba1.z")));
            playerSecond.teleport(new Location(Bukkit.getWorld(Objects.requireNonNull(config.getString("colba2.world"))), config.getInt("colba2.x"), config.getInt("colba2.y"), config.getInt("colba2.z")));
            new BukkitRunnable() {
                int schet = 60;
                @Override
                public void run() {
                    if(schet == 0){
                        playerFirst.sendTitle("Start!", null, 20, 10, 20);
                        playerSecond.sendTitle("Start!", null, 20, 10, 20);
                        cancel();
                        return;
                    }
                    playerFirst.sendTitle(String.valueOf(schet), null, 20, 10, 20);
                    playerSecond.sendTitle(String.valueOf(schet), null, 20, 10, 20);
                    --schet;
                }
            }.runTaskTimer(plugin,20L, 20L);
            i++;
        }
    }




}
