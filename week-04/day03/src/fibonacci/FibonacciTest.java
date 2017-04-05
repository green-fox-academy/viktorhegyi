package fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by hegyi on 2017-04-05.
 */
class FibonacciTest {

  int index = 12;
  int zero = 0;
  int one = 1;
  int nulla;
  Fibonacci test = new Fibonacci();

  @Test
  void fibonacciIndex() {
    assertEquals(144, test.fibonacciIndex(index));
  }

  @Test
  void fibonacciToZero() {
    assertEquals(0, test.fibonacciIndex(zero));
  }

  @Test
  void fibonacciToOne() {
    assertEquals(1, test.fibonacciIndex(one));
  }

  @Test
  void fibonacciToNull() {
    assertEquals(0, test.fibonacciIndex(nulla));
  }

}