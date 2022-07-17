package we.g25.s0n1x.pvptournament.Other;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public class StandartPermsCheckForEvents{


    public boolean checkValidDamagerAndRecipient(Entity damager, Entity recipient) {
        if(!(damager instanceof Player)){
            return true;
        }

        if (!(recipient instanceof Player)){
            return true;
        }

        return false;
    }
}