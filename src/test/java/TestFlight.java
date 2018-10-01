import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFlight {
    Flight flight1;
    Flight flight2;

    @Before
    public void before() {
        flight1 = new Flight(1, "GLA", "Boing 747");
        flight2 = new Flight(2, "EDI", "Boing 737");
    }

    @Test
    public void hasFlightNumber(){
    assertEquals(1, flight1.hasFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("GLA", flight1.getDestination());

    @Test
    public void hasPlane()
    }
}
