/**
 * Created by hegyi on 2017-03-21.
 */
import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write in two numbers");
      int numberOne = scanner.nextInt();
      int numberTwo = scanner.nextInt();
        if (numberOne > numberTwo) {
          System.out.println(numberOne);
        } else {
          System.out.println(numberTwo); }



  }


  }

// Write a program that asks for two numbers and prints the bigger one