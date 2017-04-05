package sum;

import static junit.framework.TestCase.assertEquals;

import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by hegyi on 2017-04-05.
 */
public class TestSum {

  ArrayList<Integer> test = new ArrayList<>();
  Sum list = new Sum();


  @Test
  public void testMethod() {
    test.add(1);
    test.add(2);
    test.add(3);
    assertEquals(6, list.sumMethod(test));
  }

  @Test
  public void testToZeroInteger() {
    assertEquals(0, list.sumMethod(test));
  }

  @Test
  public void testToOneInteger() {
    test.add(5);
    assertEquals(5, list.sumMethod(test));
  }

  @Test
  public void testToMoreInteger() {
    test.add(5);
    test.add(5);
    test.add(10);
    assertEquals(20, list.sumMethod(test));
  }

  @Test
  public void testToNull() {
    test = null;
    assertEquals(0, list.sumMethod(test));
  }
}
