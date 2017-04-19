package charsequence;

import javax.print.DocFlavor.STRING;

/**
 * Created by Viktor on 2017-04-18.
 */
public class CharOperations implements CharSequence {
  String testForMethod = "backwards";

  public CharOperations(String input) {
    this.testForMethod = input;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return testForMethod.charAt(testForMethod.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  public static void main(String[] args) {

    String test = "backwards";
    CharOperations charOperations = new CharOperations(test);

    System.out.println(charOperations.charAt(0));
    System.out.println(charOperations.toString());
  }
}
