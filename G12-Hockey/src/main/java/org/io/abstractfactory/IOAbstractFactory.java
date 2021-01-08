/* @Author: Kethan Kumar */

package org.io.abstractfactory;

import org.io.interfaces.IAwardCeremony;
import org.io.interfaces.IDisplay;
import org.io.interfaces.IDisplayLeagueSimulation;
import org.io.interfaces.IInput;
import org.io.interfaces.IDisplayTrade;
import org.io.interfaces.IUserInputTrade;

public abstract class IOAbstractFactory {

    private static IOAbstractFactory uniqueInstance = null;

    public static IOAbstractFactory instance() {
        if (null == uniqueInstance) {
            uniqueInstance = new IOFactory();
        }
        return uniqueInstance;
    }

    public static void setFactory(IOFactory ioFactory) {
        uniqueInstance = ioFactory;
    }

    public abstract IDisplay createDisplay();

    public abstract IDisplayLeagueSimulation createDisplayLeagueSimulation();

    public abstract IInput createInput();

    public abstract IAwardCeremony createDisplayAwards();

    public abstract IDisplayTrade createDisplayTrade();

    public abstract IUserInputTrade createUserInputTrade();
}
