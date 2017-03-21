/**
 * Created by hegyi on 2017-03-21.
 */
import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Add a number: ");
    int FirstNumber = scanner.nextInt();

    System.out.println("add one more");
    int secondNumber = scanner.nextInt();

    System.out.println("and an other one");
    int thirdNumber = scanner.nextInt();

    System.out.println("and more");
    int fouthNumber = scanner.nextInt();

    System.out.println("and the last one");
    int fifthNumber = scanner.nextInt();

    int sum = fifthNumber + secondNumber + thirdNumber + fouthNumber + fifthNumber;
    double avarge = sum / 5;

    System.out.println("Sum: " + sum + ", " + "Avarge: " + avarge);


  }
}
