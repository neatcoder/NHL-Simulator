/* @Author: Kethan Kumar */

package org.trophysystem.interfaces.observer;

import org.trophysystem.abstractfactory.TrophyAbstractFactory;
import org.trophysystem.interfaces.IPerformanceObserver;
import org.trophysystem.interfaces.ITrophyNominees;

public class DraftedPlayerObserver implements IPerformanceObserver {
    ITrophyNominees awardTrophy;
    protected TrophyAbstractFactory trophyFactory;

    public DraftedPlayerObserver() {
        trophyFactory = TrophyAbstractFactory.instance();
        awardTrophy = trophyFactory.createAwardCeremony();
    }

    public void update(String draftPlayerName, int draftPlayerPoints) {
        awardTrophy.draftNominee(draftPlayerName, draftPlayerPoints);
    }

    public ITrophyNominees getAwardTrophy() {
        return awardTrophy;
    }
}
