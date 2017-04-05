package Apple;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

/**
 * Created by hegyi on 2017-04-05.
 */

public class TestApple {

  @Test
   public void testApple() {
    assertEquals("apple",Apple.getApple());
  }


}
