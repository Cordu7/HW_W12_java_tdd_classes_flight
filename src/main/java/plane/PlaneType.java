package plane;


public enum PlaneType {

    BOEING747(520, 62_200),

    BOEING737(200, 16_000),

    CESSNA172(4, 480);


   private final int capacity;
   private final int weight;

   PlaneType(int capacity, int weight){
       this.capacity = capacity;
       this.weight = weight;
   }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
