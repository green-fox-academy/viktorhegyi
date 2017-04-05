package sum;

import java.util.ArrayList;

/**
 * Created by hegyi on 2017-04-05.
 */
public class Sum {

  public static int sumMethod(ArrayList<Integer> numbers) {
    int sum = 0;
    if (numbers == null) {
      return 0;
    } else {
      for (int i = 0; i < numbers.size(); i++) {
        sum += numbers.get(i);
      }
      return sum;

    }
  }
}
