/**
 * Created by hegyi on 2017-03-30.
 */
public class String2 {

  public static void main(String[] args) {
    String wordTwo = "Helloxxxx, I am YXXxxXX";
    String wordThree = "yyxxXXXxxx";

    System.out.println(lowercase(wordTwo, 'x', ""));

  }

  private static String lowercase(String sentence, char from, String to) {
    if (sentence.length() < 1) {
      return sentence;
    } else {
      String letter;
      if (sentence.charAt(0) != 'x') {
        letter = sentence.charAt(0) + "";
      } else {
        letter = "";
      }

      return letter + lowercase(sentence.substring(1), from, to);
    }

  }
}
// Given a string, compute recursively a new string where all the 'x' chars have been removed.