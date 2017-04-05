package fibonacci;

/**
 * Created by hegyi on 2017-04-05.
 */
public class Fibonacci {

  public int fibonacciIndex(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
        return 1;
      } else {
        return fibonacciIndex(n - 1) + fibonacciIndex(n - 2);
      }
    }

}