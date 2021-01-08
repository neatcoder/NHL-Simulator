package resources.abstractfactory;

import org.leaguemodel.interfaces.ILeague;
import org.leaguemodel.interfaces.IPersistence;
import org.leaguemodel.interfaces.ITrading;
import resources.interfaces.IMockDataTrading;
import resources.MockData;
import resources.MockDataTrading;
import resources.MockTrading;

public class MockFactory extends MockAbstractFactory {
    public IMockDataTrading createMockDataTrading() {
        return new MockDataTrading();
    }

    public ITrading createMockTrading() { return new MockTrading(); }

    public ILeague createMockDataLeague() {
        return new MockData();
    }

    public IPersistence createMockDataPersistence(){ return new MockData();}
}
