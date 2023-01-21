package CabinCrew;

public class CabinCrewMember {
    private Rank rank;
    private String name;

    public CabinCrewMember(Rank rank, String name){
        this.rank = rank;
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }
}
