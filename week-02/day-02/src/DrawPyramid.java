/**
 * Created by hegyi on 2017-03-22.
 */
import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Number:");
    int number = scanner.nextInt();

    for (int i = 0; i < number; i++) {

      for (int j = i; j < number; j++) {
        if (j != number - 1) {
          System.out.print(" ");
        }
      }
      for (int k = 0; k <= i * 2; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}

// Write a program that reads a number from the standard input, then draws a
// pyramid like this
//
//
//    *
//   ***
//  *****
// *******
//