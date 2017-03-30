/**
 * Created by hegyi on 2017-03-30.
 */
public class String3 {

  public static void main(String[] args) {
    String wordTwo = "Helloxxxx, I am YXXxxXX";
    String wordThree = "yyxxXXXxxx";


    System.out.println(lowercase(wordTwo));

  }

  private static String lowercase(String sentence) {
    if (sentence.length() < 1) {
      return sentence;
    } else {
      String letter;
      if (sentence.valueOf(0) != " ") {
        letter = sentence.charAt(0) + "*";
      } else {
        letter = "";
      }

      return letter + lowercase(sentence.substring(1));
    }


  }
}
// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".