import cabinCrew.Pilot;
import cabinCrew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot(Rank.PILOT, "Freddie", "FGR123");
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.PILOT, pilot.getRank());
    }
    @Test
    public void pilotHasName(){
        assertEquals("Freddie", pilot.getName());
    }

    @Test
    public void pilotHasPilotLicenceNumber(){
        assertEquals("FGR123", pilot.getPilotLicenceNumber());
    }

    @Test
    public void  canFlyPlane(){
        assertEquals("yipeee", pilot.flyPlane("yipeee"));
    }
}
