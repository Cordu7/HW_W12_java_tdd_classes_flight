import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;


public class PlaneTest {

    private Plane boeing747;
    private Plane boeing737;
    private Plane cessna172;

    @Before
    public void before(){

        boeing747 = new Plane(PlaneType.BOEING747);
        boeing737 = new Plane(PlaneType.BOEING737);
        cessna172 = new Plane(PlaneType.CESSNA172);
    }

    @Test
    public void planeHasTypeBoeing747(){
        assertEquals(PlaneType.BOEING747, boeing747.getPlaneType());
    }
    @Test
    public void planeHasTypeBoeing737(){
        assertEquals(PlaneType.BOEING737, boeing737.getPlaneType());
    }
    @Test
    public void planeHasCessna(){
        assertEquals(PlaneType.CESSNA172, cessna172.getPlaneType());
    }

    @Test
    public void typeBoeing747HasCapacity(){
        assertEquals(520, boeing747.findOutCapacity());
    }
    @Test
    public void typeBoeing737HasCapacity(){
        assertEquals(200, boeing737.findOutCapacity());
    }
    @Test
    public void typeCessna172HasCapacity(){
        assertEquals(4, cessna172.findOutCapacity());
    }

    @Test
    public void typeBoeing747HasWeight(){
        assertEquals(62_200, boeing747.findOutWeight());
    }
    @Test
    public void typeBoeing737HasWeight(){
        assertEquals(16_000, boeing737.findOutWeight());
    }

    @Test
    public void typeCessna172HasWeight(){
        assertEquals(480, cessna172.findOutWeight());
    }


}
