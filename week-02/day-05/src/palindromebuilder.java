/**
 * Created by hegyi on 2017-03-24.
 */
import java.util.Scanner;

public class palindromebuilder {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write in a word");
    String input = scanner.nextLine();

    String reverse = new StringBuffer(input).reverse().toString();

    String palindrome = input + reverse;

    System.out.println(palindrome);
  }
}