/* @Author: Yash Jaiswal */

package org.trading;

import org.leaguemodel.CheckStrength;
import org.leaguemodel.interfaces.ICheckStrength;
import org.leaguemodel.interfaces.IPlayers;
import org.leaguemodel.interfaces.IStrength;

import java.util.Comparator;

public class StatsComparator implements Comparator<IPlayers> {


    public int compare(IPlayers a, IPlayers b) {
        ICheckStrength checkStrength = new CheckStrength();
        double playerStrengthA = checkStrength.playerStrength((IStrength) a);
        double playerStrengthB = checkStrength.playerStrength((IStrength) b);

        if (playerStrengthA == playerStrengthB) {
            return 0;
        } else if (playerStrengthA > playerStrengthB) {
            return -1;
        } else {
            return 1;
        }
    }
}
