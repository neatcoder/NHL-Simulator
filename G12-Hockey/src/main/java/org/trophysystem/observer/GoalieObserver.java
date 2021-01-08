/* @Author: Kethan Kumar */

package org.trophysystem.interfaces.observer;

import org.trophysystem.abstractfactory.TrophyAbstractFactory;
import org.trophysystem.interfaces.IPerformanceObserver;
import org.trophysystem.interfaces.ITrophyNominees;

public class GoalieObserver implements IPerformanceObserver {
    ITrophyNominees awardTrophy;
    protected TrophyAbstractFactory trophyFactory;

    public GoalieObserver() {
        trophyFactory = TrophyAbstractFactory.instance();
        awardTrophy = trophyFactory.createAwardCeremony();
    }

    public void update(String goalieName, int goaliePoints) {
        awardTrophy.goalieNominee(goalieName, goaliePoints);
    }

    public ITrophyNominees getAwardTrophy() {
        return awardTrophy;
    }
}
