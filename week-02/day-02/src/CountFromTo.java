/**
 * Created by hegyi on 2017-03-21.
 */

import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type in two numbers: ");

    int numberOne = scanner.nextInt();
    int numberTwo = scanner.nextInt();

    while ( numberOne >= numberTwo) {
      System.out.println("The second number should be bigger");
      numberOne = scanner.nextInt();
    }

      for ( int i = numberOne; i <numberTwo; i++ ) {
      System.out.println(i);
      }
  }
}
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5