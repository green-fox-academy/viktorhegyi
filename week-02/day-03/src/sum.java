/**
 * Created by hegyi on 2017-03-22.
 */
import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a number");
    int givenParameter = scanner.nextInt();
    System.out.println(sum(givenParameter));

  }

  public static int sum(int givenParameter) {
    int sumOfNumbers = 0;
    for ( int i = 1; i<givenParameter+1; i++){
      sumOfNumbers += i;
    }
    return sumOfNumbers;
  }
}



//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter