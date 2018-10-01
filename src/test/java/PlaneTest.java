import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;



    @Before
    public void before()  {
        plane = new Plane(PlaneType.Boing737, Airline.Lufthansa);

    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.Boing737, plane.getPlaneType());
    }

    @Test
    public void hasAirline() {
        assertEquals(Airlines.Lufthansa, plane.getAirline());
    }

}
