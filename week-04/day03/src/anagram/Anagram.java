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
    } else if (copyOfFirstWord.length() != copyOfSecondWord.length()) {
        return false;
    } else {
      char[] firstWordChar = copyOfFirstWord.toLowerCase().toCharArray();
      char[] secondWordChar = copyOfSecondWord.toLowerCase().toCharArray();

      Arrays.sort(firstWordChar);
      Arrays.sort(secondWordChar);

      return Arrays.equals(firstWordChar, secondWordChar);
    }
  }
}
