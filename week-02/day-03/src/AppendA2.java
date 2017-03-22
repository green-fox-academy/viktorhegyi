import java.util.Arrays;

/**
 * Created by hegyi on 2017-03-22.
 */
public class AppendA2 {
  public static void main(String[] args) {
    String [] nimals = {"kuty", "macs", "cic"};

    for ( int i = 0; i < nimals.length; i++) {
        nimals[i] +="a";
    }

    System.out.println(Arrays.toString(nimals));
  }
}
// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macs", "cic"]`
// - Add all elements an `"a"` at the end
