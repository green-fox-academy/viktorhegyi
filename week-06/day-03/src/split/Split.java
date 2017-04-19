package split;

import java.util.ArrayList;

/**
 * Created by Viktor on 2017-04-19.
 */
public class Split {

  public static void main(String[] args) {

    System.out.println(split("lovebarbara", 4));
    System.out.println(split("lovebarbara", 20));
  }

  public static ArrayList<String> split(String word, int x) {
    ArrayList<String> returnString = new ArrayList<>();

    try {
    String firstpart = word.substring(0, x);
    String secondpart = word.substring(x);
    returnString.add(firstpart);
    returnString.add(secondpart);
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("The word is not that long..");
    }
    return returnString;
  }

}
