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

    for (int i = 0; i < girls.size(); i++) {
      order.add(girls.get(i));
      order.add(boys.get(i));
    } for (int j = girls.size(); j < boys.size(); j++) {
      order.add(boys.get(j));
    }

      // Join the two lists by matching one girl with one boy in the order list
      // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

      System.out.println(order);
  }
}