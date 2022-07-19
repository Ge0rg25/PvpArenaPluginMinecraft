package we.g25.s0n1x.pvptournament;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import we.g25.s0n1x.pvptournament.Other.StandartPermsCheckForCMDs;
import we.g25.s0n1x.pvptournament.Other.StandartPermsCheckForEvents;
import we.g25.s0n1x.pvptournament.events.PlayerDamage;
import we.g25.s0n1x.pvptournament.events.PlayerJoin;
import we.g25.s0n1x.pvptournament.gameLogic.logic;

import java.util.ArrayList;
import java.util.List;

public final class PvPTournament extends JavaPlugin {

    public StandartPermsCheckForCMDs permsCheckForCMDs = new StandartPermsCheckForCMDs();
    public StandartPermsCheckForEvents permsCheckForEvents = new StandartPermsCheckForEvents();
    public List<Player> all_players = new ArrayList<Player>();

    public logic logic = new logic(this);

    boolean game_status = false;

    public boolean isPlaying() {
        return game_status;
    }

    public void setGameStatus(boolean game_status) {
        this.game_status = game_status;
    }

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerDamage(this), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
