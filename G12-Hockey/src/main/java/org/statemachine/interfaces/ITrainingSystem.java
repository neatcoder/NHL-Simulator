package org.statemachine.interfaces;

import org.leaguemodel.interfaces.IInjuries;
import org.leaguemodel.interfaces.ITeam;

public interface ITrainingSystem {

    public void CheckStatistics(IInjuries injuries, ITeam team);
}
