package cabinCrew;

public class Pilot extends CabinCrewMember{

    private String pilotLicenceNumber;

    public Pilot(Rank rank, String name, String pilotLicenceNumber) {
        super(rank, name);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }
}
