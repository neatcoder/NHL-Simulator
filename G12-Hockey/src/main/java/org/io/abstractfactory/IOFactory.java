/* @Author: Kethan Kumar */

package org.io.abstractfactory;

import org.io.*;
import org.io.interfaces.IAwardCeremony;
import org.io.interfaces.IDisplay;
import org.io.interfaces.IDisplayLeagueSimulation;
import org.io.interfaces.IInput;
import org.io.interfaces.IDisplayTrade;
import org.io.interfaces.IUserInputTrade;

public class IOFactory extends IOAbstractFactory {

    public IDisplay createDisplay() {
        return new Display();
    }

    public IDisplayLeagueSimulation createDisplayLeagueSimulation() {
        return new DisplayLeagueSimulation();
    }

    public IInput createInput() {
        return new Input();
    }

    public IAwardCeremony createDisplayAwards() {
        return new DisplayAwards();
    }

    public IDisplayTrade createDisplayTrade() {
        return new DisplayTrade();
    }

    public IUserInputTrade createUserInputTrade() {
        return new UserInputTrade();
    }

}
