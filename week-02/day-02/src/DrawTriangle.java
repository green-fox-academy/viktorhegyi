/**
 * Created by hegyi on 2017-03-22.
 */
import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Number:");
    int number = scanner.nextInt();

    for ( int i = 1; i < number + 1; i++) {
      for (int j = 0; j < i; j++) {
      System.out.print("*");
      }
      System.out.println("");
      }
  }
}
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
