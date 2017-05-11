/**
 * Created by Viktor on 2017-05-11.
 */
public class FizzBuzz {

  public static String fizzBuzz(int number) {

    String name = "";

    if (number > 100) {
      return "out of bound";
    }
    if (number % 15 == 0) {
      return "fizzbuzz";
    } else if (number % 3 == 0) {
      return "fizz";
    } if (number % 5 == 0) {
      return "buzz";
    }
    return name.valueOf(number);
  }
}
