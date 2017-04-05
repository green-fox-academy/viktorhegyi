package anagram;

import java.util.Arrays;

/**
 * Created by hegyi on 2017-04-05.
 */
public class Anagram {

  public boolean testAnagram(String firstWord, String secondWord) {
    String copyOfFirstWord = firstWord.replaceAll("\\s", "");
    String copyOfSecondWord = secondWord.replaceAll("\\s", "");

    if (copyOfFirstWord == copyOfSecondWord) {
      return true;
    } else if (firstWord.length() != secondWord.length()) {
        return false;
    } else {
      char[] inputOneChar = copyOfFirstWord.toLowerCase().toCharArray();
      char[] inputTwoChar = copyOfSecondWord.toLowerCase().toCharArray();

      Arrays.sort(inputOneChar);
      Arrays.sort(inputTwoChar);

      return Arrays.equals(inputOneChar, inputTwoChar);
    }
  }
}
