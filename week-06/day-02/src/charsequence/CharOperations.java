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
    return testForMethod.length();
  }

  @Override
  public char charAt(int index) {
    return testForMethod.charAt(testForMethod.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String reversed = reverse(testForMethod);
    return reversed.substring(start,end);
  }

  @Override
  public String toString() {
    return reverse(testForMethod);
  }

  private String reverse(String input) {
    StringBuilder original = new StringBuilder(input);
    return original.reverse().toString();
  }

  public static void main(String[] args) {

    String test = "backwards";
    CharOperations charOperations = new CharOperations(test);

    System.out.println(charOperations.charAt(1));
    System.out.println(charOperations.subSequence(2,4));
    System.out.println(charOperations.toString());
  }
}
