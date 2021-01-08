package org.statemachine.interfaces;

import org.leaguemodel.interfaces.IGeneralManager;
import org.leaguemodel.interfaces.IHeadCoach;
import org.leaguemodel.interfaces.ILeague;

public interface IValidate {

    public boolean validateLOM(ILeague leagueLOM);

    public IGeneralManager validateGeneralManager(ILeague leagueOne, String generalManager);

    public IHeadCoach validateHeadCoach(ILeague leagueLOM, String headCoach);

    public boolean validateString(String userInput);

    boolean schemaValidation(String leagueData, String jsonSchema);
}
