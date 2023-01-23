import cabinCrew.Pilot;
import cabinCrew.CabinCrewMember;
import cabinCrew.Rank;
import plane.Plane;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrew= new ArrayList<CabinCrewMember>();
    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destinationAirport,String departureAirport, String departureTime){
        this.pilot = pilot;
        this.cabinCrew = new ArrayList<CabinCrewMember>();
        this.bookedPassengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int passengerListSize(){
        return this.bookedPassengers.size();
    }


    public int returnNumberOfAvailableSeats(){
        int seatsAvailable = this.plane.findOutCapacity()- passengerListSize();
        return seatsAvailable;
    }
    public void addCabinCrew(CabinCrewMember cabinCrewMember) {
        this.cabinCrew.add(cabinCrewMember);
    }

    public void bookPassenger(Passenger passenger) {
        if (returnNumberOfAvailableSeats() > 0) {
            this.bookedPassengers.add(passenger);

        }
    }

//    * return the number of available seats
//* book a passenger (if there are remaining seats)




    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
