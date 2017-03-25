import java.util.Scanner;

/**
 * Created by hegyi on 2017-03-25.
 */
public class ParametricAverage {

  public static void main (String[] args) {
    System.out.println("How many numbers do you want to sum?");
    Scanner scanner = new Scanner(System.in);
    int numberAsk = scanner.nextInt();
    int total = 0;


    for (int i = 1; i <= numberAsk; i++) {
      System.out.println("Add number " + i);
      int numbers = scanner.nextInt();
      total = total + numbers;
    }
    double average = total / numberAsk;
    System.out.println("The sum of the numbers: " + total + " and the average: " + average);
  }

}

// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
