/**
 * Created by hegyi on 2017-03-22.
 */
import java.util.Arrays;

public class Printer {
  public static void main(String[] args) {
    String inputOne = "This ";
    String inputTwo = "is ";
    String inputThree = "a ";
    String inputFour = "sentence";

    String input = inputOne + inputTwo + inputThree + inputFour;

    printer(input);

  }

  public static void printer(String input) {
    System.out.println(input);
  }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
//   (can have multiple number of arguments)
