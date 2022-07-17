package we.g25.s0n1x.pvptournament.Other;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StandartPermsCheck {


    public boolean checkValidSender(CommandSender sender) {
        if (!(sender instanceof Player)) {
            System.out.println("Эту комманду может написать только игрок!");
            return true;
        }

        Player cmd_sender = (Player) sender;

        if (!(cmd_sender.isOp())) {
            cmd_sender.sendMessage(ChatColor.RED + "Этим плагином управляет только оператор!");
            return true;
        }
        return false;
    }
}

