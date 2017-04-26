package sumthearray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Viktor on 2017-04-25.
 */
public class SumTheArray {

  public static void main(String[] args) {

    Integer[] integerList = {3,4,2,6,1};
    Float[] floatList = {2f, 5f, 3f, 8f};
    Double[] doubleList = {5.3, 4.2, 9.6, 3.2};

    sumArray(integerList, 10);
    sumArray(floatList, 4);
    sumArray(doubleList, 2);
  }

  public static <T extends Number> double sumArray( T[] inputArray, int lenght ) {
    double sum = 0;
    if (lenght > inputArray.length) {
      System.out.println("The lenght is more than the arraysize");
      for (T element : inputArray) {
        System.out.printf("%s ", element);
        break;
      }
    } else {
      ArrayList<T> list = new ArrayList<T>(Arrays.asList(inputArray));
      for (int i = 0; i < list.size(); i++) {
        T element = inputArray[i];
        sum += element.doubleValue();
      }
    }
    for (T element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println("\nThe sum is: ");
    System.out.println(sum);
    return sum;
  }

}
