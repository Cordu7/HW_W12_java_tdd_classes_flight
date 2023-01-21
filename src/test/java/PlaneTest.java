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
    private void before(){

        boeing747 = new Plane();
        boeing737 = new Plane();
        cessna172 = new Plane();
    }

    @Test
    private void planeHasTypeBoeing747(){
        assertEquals(PlaneType.BOEING747, boeing747.getType());
    }
    @Test
    private void planeHasTypeBoeing737(){
        assertEquals(PlaneType.BOEING737, boeing737.getType());
    }
    @Test
    private void planeHasTypeBoeing747(){
        assertEquals(PlaneType.BOEING737, boeing737.getType());
    }

    @Test
    private void typeBoeing747HasCapacity(){
        assertEquals(520, boeing747.findOutCapacity());
    }
    @Test
    private void typeBoeing737HasCapacity(){
        assertEquals(200, boeing737.findOutCapacity());
    }
    @Test
    private void typeCessna172HasCapacity(){
        assertEquals(520, cessna172.findOutCapacity());
    }

    @Test
    private void typeBoeing747HasWeight(){
        assertEquals(62_200, boeing747.findOutWeight());
    }
    @Test
    private void typeBoeing747HasWeight(){
        assertEquals(16_000, boeing737.findOutWeight());
    }

    @Test
    private void typeCessna172HasWeight(){
        assertEquals(480, cessna172.findOutWeight());
    }


}
