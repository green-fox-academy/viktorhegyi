/**
 * Created by hegyi on 2017-03-23.
 */
import java.util.*;

public class matchmaking {

  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(
        Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(
        Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    ArrayList<String> order = new ArrayList<String>();

    order.addAll(girls);
    order.addAll(boys);

      // Join the two lists by matching one girl with one boy in the order list
      // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

      System.out.println(order);
  }
}
