/* @Author: Kethan Kumar */

package org.trophysystem.abstractfactory;

import org.trophysystem.AwardCeremony;
import org.trophysystem.interfaces.IAwardWinners;
import org.trophysystem.interfaces.IPerformanceObserver;
import org.trophysystem.interfaces.ITeamObserver;
import org.trophysystem.interfaces.ITrophyNominees;

public class TrophyFactory extends TrophyAbstractFactory {
    public IPerformanceObserver createDefenseMenObserver() {
        return new org.trophysystem.interfaces.observer.DefenseMenObserver();
    }

    public IPerformanceObserver createDraftPlayerObserver() {
        return new org.trophysystem.interfaces.observer.DraftedPlayerObserver();
    }

    public IPerformanceObserver createGoalieObserver() {
        return new org.trophysystem.interfaces.observer.GoalieObserver();
    }

    public IPerformanceObserver createGoalScorerObserver() {
        return new org.trophysystem.interfaces.observer.GoalScorerObserver();
    }

    public IPerformanceObserver createHeadCoachObserver() {
        return new org.trophysystem.interfaces.observer.HeadCoachObserver();
    }

    public ITeamObserver createRegularSeasonObserver() {
        return new org.trophysystem.interfaces.observer.RegularSeasonObserver();
    }

    public ITrophyNominees createAwardCeremony() {
        return AwardCeremony.instance();
    }

    public IAwardWinners createAwardWinners() {
        return AwardCeremony.instance();
    }
}
