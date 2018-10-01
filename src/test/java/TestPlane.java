import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlane {
  Plane plane;

  @Before
    public void before(){
      plane = new Plane("Boing 747");
  }

  @Test
    public void hasType(){
      assertEquals("Boing 747", plane.getType());
  }

}
