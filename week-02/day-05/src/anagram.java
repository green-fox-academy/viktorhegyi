/**
 * Created by hegyi on 2017-03-24.
 */
import java.util.Arrays;
import java.util.Scanner;

public class anagram {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write in two words to find out if they are anagrams");

    String inputOne = scanner.nextLine();
    String inputTwo = scanner.nextLine();

    String copyOfInputOne = inputOne.replaceAll("\\s", "");
    String copyOfInputTwo = inputTwo.replaceAll("\\s", "");

    if (inputOne.length() != inputTwo.length()) {
      System.out.println("Not anagram");
    } else {
      char[] inputOneChar = copyOfInputOne.toLowerCase().toCharArray();
      char[] inputTwoChar = copyOfInputTwo.toLowerCase().toCharArray();

      Arrays.sort(inputOneChar);
      Arrays.sort(inputTwoChar);

      Arrays.equals(inputOneChar, inputTwoChar);

      System.out.println("Yee. Anagram.");

    }

  }
}
