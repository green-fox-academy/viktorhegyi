import java.util.Arrays;

/**
 * Created by hegyi on 2017-03-22.
 */
public class SwapElements {
  public static void main(String[] args) {
    String [] abc = {"first", "second", "third"};

    abc[0] = abc[2];
    abc[2] = abc[0];

    System.out.println(Arrays.toString(abc));

  }
}

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`