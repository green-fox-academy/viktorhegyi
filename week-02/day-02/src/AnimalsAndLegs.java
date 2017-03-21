/**
 * Created by hegyi on 2017-03-21.
 */

import java.util.Scanner;


public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("How many chickens do you have?");
        int chichens = scanner.nextInt();
      System.out.println("How many pigs do you have?");
        int pigs = scanner.nextInt();

      int numberOfLegs = (chichens * 2) + (pigs * 4);

    System.out.println("Your animals have " + numberOfLegs + " legs all together.");
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The seconf represents the number of pigs the farmer has
    // It should print how many legs all the animals have
  }
}
