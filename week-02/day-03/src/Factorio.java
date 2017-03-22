/**
 * Created by hegyi on 2017-03-22.
 */
import java.util.Scanner;

public class Factorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Number?");
    int input = scanner.nextInt();
    factorio(input);

  }

  public static void factorio(int input) {
    int factorial = input;
    for (int i = 1; i<input; i++) {
      factorial = factorial * i;
    }
    System.out.println("Factorial: " + factorial);
    }
  }

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial