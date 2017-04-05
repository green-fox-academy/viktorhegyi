package sum;

import java.util.ArrayList;

/**
 * Created by hegyi on 2017-04-05.
 */
public class Sum {

  public static int sumMethod ( ArrayList<Integer> numbers) {
   int sum = 0;
    for (int i = 0; i <numbers.size() ; i++) {
      sum += numbers.get(i);
    }
    return sum;
  }

}
