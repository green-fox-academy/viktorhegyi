package calculator;

/**
 * Created by Viktor on 2017-04-26.
 */
public class CalculatorApp {

  public static void main(String[] args) {

    Calculator calculator = new Calculator();

    System.out.println(calculator.addElements(4, 6, 3.4, 4f));
    System.out.println(calculator.substractElements(30, 2.4, 5f));
    System.out.println(calculator.multiplyElements(4, 6, 3.4, 4f));
    System.out.println(calculator.divideElements(40, 2.2, 2f));
  }

}
