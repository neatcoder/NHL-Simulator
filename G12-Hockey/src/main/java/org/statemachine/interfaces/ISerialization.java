package org.statemachine.interfaces;

import org.leaguemodel.interfaces.ILeague;

public interface ISerialization {

    public void serialize(ILeague leagueLOM);

    public ILeague deserialize(String filename);
}

