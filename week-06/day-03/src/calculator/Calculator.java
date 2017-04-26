package calculator;

/**
 * Created by Viktor on 2017-04-26.
 */
public class Calculator {

  public Calculator() {
  }

  public static <T extends Number> double addElements(T... numbers ) {
    double sum = 0;
    for (int i = 0; i <numbers.length ; i++) {
      T element = numbers[i];
      sum += element.doubleValue();
    }
    System.out.println("Adding the numbers, the answer: ");
    return sum;
  }

  public static <T extends Number> double substractElements(T... numbers ) {
    double result = numbers[0].doubleValue();
    for (int i = 1; i <numbers.length ; i++) {
      T element = numbers[i];
      result -= element.doubleValue();
    }
    System.out.println("Substracting the numbers, the answer: ");
    return result;
  }

  public static <T extends Number> double multiplyElements(T... numbers ) {
    double result = 1;
    for (int i = 0; i <numbers.length ; i++) {
      T element = numbers[i];
      result *= element.doubleValue();
    }
    if ( result == 0) {
      System.out.println("The answer is 0 because you have an element 0.");
    } else {
      System.out.println("Multiplying the numbers, the answer: ");
    }
    return result;
  }

  public static <T extends Number> double divideElements(T... numbers ) {
    double result = numbers[0].doubleValue();
    for (int i = 0; i <numbers.length ; i++) {
      if (numbers[i].doubleValue() == 0) {
        System.out.println("You can't divide by 0, because it is 0.");
        return 0;
      }
    }
    for (int i = 1; i <numbers.length ; i++) {
      T element = numbers[i];
      result /= element.doubleValue();
    }
    System.out.println("The answer: ");
    return result;
  }

}
