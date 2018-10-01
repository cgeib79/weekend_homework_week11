import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangar {
    Hangar smallHangar;
    Hangar largeHangar;

    Plane plane1;
    Plane plane2;

    @Before
    public void before(){
    smallHangar = new Hangar(1, "Small", "737 size");
    largeHangar = new Hangar(2, "Large", "747 size");

    plane1 = new Plane("737");
    plane2 = new Plane("747");
    }

    //small Hangar
    @Test
    public void smallHangarHasNumber(){
        assertEquals(1, smallHangar.getNumber());
    }

    @Test
    public void smallHangarHasType(){
        assertEquals("Small", smallHangar.getType());
    }

    @Test
    public void smallHangarHasSize(){
        assertEquals("737 size", smallHangar.getSize());
    }

    @Test
    public void smallHangarStartsEmpty(){
        assertEquals(0, smallHangar.numberOfPlanes());
    }
    //large Hangar

    @Test
    public void largeHangarHasNumber(){
        assertEquals(2, largeHangar.getNumber());
    }

    @Test
    public void largeHangarHasType(){
        assertEquals("Large", largeHangar.getType());
    }

    @Test
    public void largeHangarHasSize(){
        assertEquals("747 size", largeHangar.getSize());
    }
    @Test
    public void largeHangarStartsEmpty(){
        assertEquals(0, largeHangar.numberOfPlanes());
    }
}
