/**
 * Created by hegyi on 2017-03-23.
 */
import java.util.*;

public class appendletter {
    public static void main(String... args){
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

    for ( int i = 0; i < far.size(); i++) {
      String add = far.get(i);
      far.set(i, add + "a");
    }

    // Add "a" to every string in the far list.

    System.out.println(far);
  }
}
