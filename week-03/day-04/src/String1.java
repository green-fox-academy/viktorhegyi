/**
 * Created by hegyi on 2017-03-30.
 */

public class String1 {

  public static void main(String[] args) {
    String word = "HelloxXX";
    String wordTwo = "x";
    String wordThree = "xxXXXxxx";
    System.out.println(lowercase(wordThree, 'x', 'y'));

  }

  private static String lowercase(String sentence, char from, char to) {
    if (sentence.length() < 1) {
      return sentence;
    } else {
      char letter = from;
      if (sentence.charAt(0) == letter) {
        letter = to;
      } else {
        letter = sentence.charAt(0);
      }

      return letter + lowercase(sentence.substring(1), from, to);
    }
  }
}

// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.