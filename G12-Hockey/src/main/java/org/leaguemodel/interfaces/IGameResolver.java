/* @Author:  Siddhant Ashutosh */
package org.leaguemodel.interfaces;

public interface IGameResolver {

    Double getPenaltyChance();

    Double getShotToGoalChance();

    Double getPenaltyToGoalChance();

    void setPenaltyChance(Double penaltyChance);

    void setShotToGoalChance(Double shotToGoalChance);

    void setPenaltyToGoalChance(Double penaltyToGoalChance);
}
