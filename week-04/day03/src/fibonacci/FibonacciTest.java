package fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by hegyi on 2017-04-05.
 */
class FibonacciTest {

  int index = 12;
  Fibonacci test = new Fibonacci();

  @Test
  void fibonacciIndex() {
    assertEquals(144, test.fibonacciIndex(index));
  }

}