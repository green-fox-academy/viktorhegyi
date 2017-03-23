/**
 * Created by hegyi on 2017-03-23.
 */
import java.util.*;

public class quoteswap {

  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<String>(
        Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    //Collections.swap(list, 2,5);

    String don = list.get(2);
    String cannot = list.get(5);

    list.add(2, cannot);
    list.add(5, don);

    list.remove(3);
    list.remove(6);

    System.out.println(list);

    for (String sentence : list) {
      System.out.print(sentence + " ");

    }

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code

    // Also, print the sentence to the output with spaces in between.
  }
}


