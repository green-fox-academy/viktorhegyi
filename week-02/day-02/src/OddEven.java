/**
 * Created by hegyi on 2017-03-21.
 */
import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    System.out.println("Give me a number");
    Scanner scanner = new Scanner(System.in);
      int userInput = scanner.nextInt();

      if (userInput % 2 == 0 ) {
        System.out.println("Odd"); }
        else { System.out.println("Even"); }






  }
}
