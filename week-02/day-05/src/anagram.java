/**
 * Created by hegyi on 2017-03-24.
 */
import java.util.Arrays;
import java.util.Scanner;

public class anagram {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write in two words to find out if they are anagrams");

    String wordOne = scanner.nextLine();
    String wordTwo = scanner.nextLine();

    anagram(wordOne, wordTwo);
  }

  public static void anagram(String inputOne, String inputTwo) {
    String copyOfInputOne = inputOne.replaceAll("\\s", "");
    String copyOfInputTwo = inputTwo.replaceAll("\\s", "");
    boolean status = true;

    if (inputOne.length() != inputTwo.length()) {
      status = false;
    } else {
      char[] inputOneChar = copyOfInputOne.toLowerCase().toCharArray();
      char[] inputTwoChar = copyOfInputTwo.toLowerCase().toCharArray();

      Arrays.sort(inputOneChar);
      Arrays.sort(inputTwoChar);

      status = Arrays.equals(inputOneChar, inputTwoChar);
      }
    if (status) {
      System.out.println("Yeee. Anagrams");
      } else {
      System.out.println("Not anagrams");
      }
  }
}
