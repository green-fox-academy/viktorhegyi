package sortthearray;
import java.util.Arrays;

/**
 * Created by Viktor on 2017-04-19.
 */
public class SortTheArray {

  public static void main(String[] args) {
    Integer[] integerList = {3,4,2,6,1};
    Float[] floatList = {2f, 5f, 3f, 8f};
    Double[] doubleList = {5.3, 4.2, 9.6, 3.2};

    sortArray(integerList);
    sortArray(floatList);
    sortArray(doubleList);

    printArray(integerList);
    printArray(floatList);
    printArray(doubleList);
  }

  public static <T extends Number> T[] sortArray( T[] inputArray ) {
    Arrays.sort(inputArray);
    return inputArray;
  }

  public static <T> void printArray( T[] inputArray ) {
    for(T element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }

}
