import java.util.Arrays;

/**
 * Created by Viktor on 2017-05-11.
 */
public class Kata {

  public static boolean anagram(String one, String two) {
    if (one == null && two == null){
      return true;
    }
    if (one == null || two == null){
      return false;
    }

    String copyOfOne = one.replaceAll("\\s+", "").toLowerCase();
    String copyOfTwo = two.replaceAll("\\s+", "").toLowerCase();

    if ( copyOfOne.length() != copyOfTwo.length())
      return false;

    char[] charStringOne = copyOfOne.toCharArray();
    char[] charStringTwo = copyOfTwo.toCharArray();

    Arrays.sort(charStringOne);
    Arrays.sort(charStringTwo);

    if (!Arrays.equals(charStringOne, charStringTwo)) {
      return false;
    }

    return true;
  }
}
