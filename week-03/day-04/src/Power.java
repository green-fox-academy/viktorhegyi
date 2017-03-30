/**
 * Created by hegyi on 2017-03-30.
 */
public class Power {

  public static void main(String[] args) {

    System.out.println(power(2, 6));
  }

  public static int power(int n, int p) {
    if ( p == 1 ) {
      return n;
    } else {
      return n * power(n, p - 1);
    }
  }

}
// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).