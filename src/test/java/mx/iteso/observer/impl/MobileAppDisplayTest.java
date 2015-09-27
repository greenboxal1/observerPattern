package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;

/**
 * Created by salvadorbeltran on 9/24/2015.
 */
public class MobileAppDisplayTest {
    private MobileAppDisplay mobileAppDisplay;
    private ScoresData scoresData;
    private List<Scorer> scorers;
    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        mobileAppDisplay = new MobileAppDisplay(scoresData);

    }

    @Test
    public void testUpdate() {
        scorers = new ArrayList<Scorer>();
        scorers.add(new Scorer("Salvador","Defense",7, "Tacit Knowledge"));
        mobileAppDisplay.update("homeTeam", "awayTeam", 1, 0,scorers);
        //Nothing to assert or verify for now
    }
}
