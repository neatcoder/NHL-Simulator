/* @Author:  Siddhant Ashutosh */
package org.leaguemodel;

import org.leaguemodel.interfaces.IGameResolver;

public class GameResolver implements IGameResolver {

    private Double penaltyChance;
    private Double shotToGoalChance;
    private Double penaltyToGoalChance;


    public Double getPenaltyChance() {
        return penaltyChance;
    }


    public Double getShotToGoalChance() {
        return shotToGoalChance;
    }


    public Double getPenaltyToGoalChance() {
        return penaltyToGoalChance;
    }


    public void setPenaltyChance(Double penaltyChance) {
        this.penaltyChance = penaltyChance;
    }


    public void setShotToGoalChance(Double shotToGoalChance) {
        this.shotToGoalChance = shotToGoalChance;
    }


    public void setPenaltyToGoalChance(Double penaltyToGoalChance) {
        this.penaltyToGoalChance = penaltyToGoalChance;
    }


}
