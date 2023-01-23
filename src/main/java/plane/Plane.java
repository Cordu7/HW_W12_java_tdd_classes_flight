package plane;


public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int findOutCapacity(){
        return this.planeType.getCapacity();


    }

    public int findOutWeight(){
        return this.planeType.getWeight();
    }
}
