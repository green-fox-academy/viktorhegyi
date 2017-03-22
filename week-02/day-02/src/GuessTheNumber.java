/**
 * Created by hegyi on 2017-03-22.
 */
import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("I think of a number. Guess!!");
    int theNumber = 8;
    int guess = scanner.nextInt();

    while (theNumber != guess) {
      if (guess > theNumber) {
        System.out.println("Lower");
        guess = scanner.nextInt();
      } else if (guess < theNumber) {
        System.out.println("Higher");
        guess = scanner.nextInt();

      }
    }
    System.out.println("You found out!");
  }
}

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8