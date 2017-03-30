/**
 * Created by hegyi on 2017-03-30.
 */
public class Counter {

  public static void main(String[] args) {

    System.out.println(counter(10));
  }

  public static int counter (int n) {
    if ( n <= 0 ) {
      return 0;
    } else {
      System.out.println(n);
      return counter(--n);
    }
  }
}

// Write a recursive function that takes one parameter: n and counts down from n.