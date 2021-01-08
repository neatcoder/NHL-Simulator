package org.trophysystemtest.observer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.trophysystem.abstractfactory.TrophyAbstractFactory;
import org.trophysystem.interfaces.IAwardWinners;
import org.trophysystem.interfaces.IPerformanceObserver;

public class DefenseMenObserverTest {
    IPerformanceObserver performanceObserver;
    @Before
    public void initialize(){
        TrophyAbstractFactory trophyFactory = TrophyAbstractFactory.instance();;
        performanceObserver = trophyFactory.createDefenseMenObserver();
    }

    @Test
    public void testUpdate() {
        performanceObserver.update("Henry",10);
        performanceObserver.update("Mathew",11);
        IAwardWinners awardTrophy = (IAwardWinners)performanceObserver.getAwardTrophy();
        Assert.assertEquals("Mathew",awardTrophy.getBestDefenseMen());
    }

    @After
    public void destroy(){
        performanceObserver=null;
    }
}
