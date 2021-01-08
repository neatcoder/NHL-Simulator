/* @Author: Kethan Kumar */

package org.trophysystem.interfaces.observer;

import org.trophysystem.abstractfactory.TrophyAbstractFactory;
import org.trophysystem.interfaces.IPerformanceObserver;
import org.trophysystem.interfaces.ITrophyNominees;

public class HeadCoachObserver implements IPerformanceObserver {
    ITrophyNominees awardTrophy;
    protected TrophyAbstractFactory trophyFactory;

    public HeadCoachObserver() {
        trophyFactory = TrophyAbstractFactory.instance();
        awardTrophy = trophyFactory.createAwardCeremony();
    }

    public void update(String coachName, int coachPoints) {
        awardTrophy.coachNominees(coachName, coachPoints);
    }

    public ITrophyNominees getAwardTrophy() {
        return awardTrophy;
    }
}
