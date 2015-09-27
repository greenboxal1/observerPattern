package mx.iteso.observer.impl;

import org.junit.Before;
import org.junit.Test;
import mx.iteso.observer.Scorer;
import java.util.List;

import static org.mockito.Mockito.mock;

public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;
    private List<Scorer> scorers;
    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        storeMonitorDisplay.update("homeTeam", "awayTeam", 1, 0,scorers);
        //Nothing to assert or verify for now
    }
}
