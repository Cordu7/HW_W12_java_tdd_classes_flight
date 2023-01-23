import cabinCrew.CabinCrewMember;
import cabinCrew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember captain;
    CabinCrewMember firstOfficer;
    CabinCrewMember purser;
    CabinCrewMember flightAttendant;

    @Before
    public void before(){
        captain = new CabinCrewMember(Rank.CAPTAIN, "Sandra");
        firstOfficer = new CabinCrewMember(Rank.FIRST_OFFICER, "Holly");
        purser = new CabinCrewMember(Rank.PURSER, "Susie");
        flightAttendant = new CabinCrewMember(Rank.FLIGHT_ATTENDANT, "Jim");
    }

    @Test
    public void hasRankCaptain(){
        assertEquals(Rank.CAPTAIN, captain.getRank());
    }
    @Test
    public void hasRankFirstOfficer(){
        assertEquals(Rank.FIRST_OFFICER, firstOfficer.getRank());
    }
    @Test
    public void hasRankPurser(){
        assertEquals(Rank.PURSER, purser.getRank());
    }
    @Test
    public void hasRankFlightAttendant(){
        assertEquals(Rank.FLIGHT_ATTENDANT, flightAttendant.getRank());
    }
    @Test
    public void hasName(){
        assertEquals("Susie", purser.getName());
    }

    @Test
    public void  canRelayMessage(){
        assertEquals("Welcome aboard", flightAttendant.relayMessage("Welcome aboard"));
    }






}
