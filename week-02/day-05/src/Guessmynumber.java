/**
 * Created by hegyi on 2017-03-24.
 */
import java.util.Random;
import java.util.Scanner;

public class Guessmynumber {

  public static void main(String... args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int guess;
    int numberOfTries = 0;
    boolean winner = false;
    System.out.println("Give me a range what you want to guess from");
    int rangeLow = scanner.nextInt();
    int rangeHigh = scanner.nextInt();

    int generatedNumber = random.nextInt(rangeHigh-rangeLow +1) + rangeLow;

    System.out.println("I have the number between "+ rangeLow + " - "  + rangeHigh +
        ". Guess which one is it:");

    while ( winner == false) {

      guess = scanner.nextInt();
      if ( guess < rangeLow || guess > rangeHigh) {
        System.out.println("Guess is out of range. You have to guess between "
                            + rangeLow + " - " + rangeHigh);
      }   else if ( guess == generatedNumber) {
          winner = true;
          } else if ( guess < generatedNumber) {
            System.out.println("Too low");
          } else if ( guess > generatedNumber) {
            System.out.println("Too high");


      }
    }
    System.out.println("Congratulation. You won.");

  }
}
