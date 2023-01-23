import cabinCrew.CabinCrewMember;
import cabinCrew.Pilot;
import cabinCrew.Rank;
import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FLightTest {
    Pilot pilot;
    CabinCrewMember captain;
    CabinCrewMember firstOfficer;
    CabinCrewMember purser;
    CabinCrewMember flightAttendant;
    CabinCrewMember flightAttendant2;
    Flight flight;
    Plane cessna172;

    @Before
    public void before(){

        pilot = new Pilot(Rank.PILOT, "Freddie", "FGR123");
        captain = new CabinCrewMember(Rank.CAPTAIN, "Sandra");
        firstOfficer = new CabinCrewMember(Rank.FIRST_OFFICER, "Holly");
        purser = new CabinCrewMember(Rank.PURSER, "Susie");

        flightAttendant = new CabinCrewMember(Rank.FLIGHT_ATTENDANT, "Jim");
        flightAttendant2 = new CabinCrewMember(Rank.FLIGHT_ATTENDANT, "Pat");

        cessna172 = new Plane(PlaneType.CESSNA172);
        flight = new Flight(pilot, cessna172, "1234gr", "STR", "EDI", "16.00");
        flight.addCabinCrew(captain);
        flight.addCabinCrew(flightAttendant);
        flight.addCabinCrew(flightAttendant2);
    }

    @Test
    public void flightHasEmptyPassengerList(){
        assertEquals(0, flight.passengerListSize());
    }
    @Test
    public void flightCanReturnNumberOfAvailableSeats(){
        assertEquals(4, flight.returnNumberOfAvailableSeats());
    }
    @Test
    public void flightCanBookPassengers(){
        flight.bookPassenger(new Passenger("Janick", 2));
        assertEquals(1, flight.passengerListSize());
    }
    @Test
    public void flightDesNotBookPassengersWhenFull(){
        flight.bookPassenger(new Passenger("Janick", 2));
        flight.bookPassenger(new Passenger("Janick", 2));
        flight.bookPassenger(new Passenger("Janick", 2));
        flight.bookPassenger(new Passenger("Janick", 2));
        flight.bookPassenger(new Passenger("Janick", 2));
        assertEquals(4, flight.passengerListSize());
    }


}



//
//        * an empty list of booked `Passenger`'s
//        * a `Plane`
//        * flight number (i.e. "FR756")
//        * destination (i.e. GLA, EDI)
//        * departure airport (i.e. GLA, EDI)
//        * departure time (use a String)
//
//        The `Flight`  should be able to:
//
//        * return the number of available seats
//        * book a passenger (if there are remaining seats)
