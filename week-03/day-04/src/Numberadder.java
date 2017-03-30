/**
 * Created by hegyi on 2017-03-30.
 */
public class Numberadder {

  public static void main(String[] args) {

    System.out.println(counter(6));
  }

  public static int counter (int n) {
    if ( n <= 0 ) {
      return 0;
    } else {
      int result = n + counter(n -1);
      return result;
    }
  }
}
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
