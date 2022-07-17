package we.g25.s0n1x.pvptournament.CMDs;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import we.g25.s0n1x.pvptournament.PvPTournament;

import java.util.Objects;

public class Start implements CommandExecutor {

     PvPTournament plugin;

    public Start(PvPTournament plugin){
        Objects.requireNonNull(plugin.getCommand("start")).setExecutor(this);
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (plugin.permsCheck.checkValidSender(sender)){

        }

        return true;
    }
}
