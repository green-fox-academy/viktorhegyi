/**
 * Created by hegyi on 2017-03-30.
 */
public class Bunny2 {
  public static void main(String[] args) {

    System.out.println(bunnies(10));
  }

  public static int bunnies(int n) {
    int sum;
    if (n == 1) {
      return 2;
    } else {
        if (n % 2 == 0) {
        sum = 2 + bunnies(n - 1);
      } else {
        sum = 3 + bunnies(n - 1);
      }
    }
    return sum;
  }
}
// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).