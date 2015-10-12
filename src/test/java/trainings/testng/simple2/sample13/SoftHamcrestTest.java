package trainings.testng.simple2.sample13;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class SoftHamcrestTest {
  
  @Test
  public void testHardAssert() {
    assertThat("Three", 2 * 2, is(3));
    assertThat("Five", 2 * 2, is(5));
  }

  @Test
  public void testSoftAssert() {
    SoftHamcrestAssert h = new SoftHamcrestAssert();
    h.assertThat("Three", 2 * 2, is(3));
    h.assertThat("Five", 2 * 2, is(5));
    h.assertAll();
  }
}
