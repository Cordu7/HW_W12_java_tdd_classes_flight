import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Cordu", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Cordu", passenger1.getName());
    }
    @Test
    public void passengerHasBags(){
        assertEquals(2, passenger1.getBags());
    }
}
