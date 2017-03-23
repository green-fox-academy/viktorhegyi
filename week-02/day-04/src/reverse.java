/**
 * Created by hegyi on 2017-03-23.
 */
public class reverse {
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    StringBuffer correctSentence = new StringBuffer(reversed);

    // Create a function that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    System.out.println(correctSentence.reverse());
  }

}
