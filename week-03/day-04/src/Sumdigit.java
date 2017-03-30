/**
 * Created by hegyi on 2017-03-30.
 */
public class Sumdigit {

  public static void main(String[] args) {

    System.out.println(summer(1261));
  }

  public static int summer (int n) {
    if ( n <= 10 ) {
      return 1;
    } else {
      int result = n % 10 + summer(n / 10) ;
      return result;
    }
  }
}
// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).