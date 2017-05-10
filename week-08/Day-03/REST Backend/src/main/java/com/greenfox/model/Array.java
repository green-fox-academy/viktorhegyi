package com.greenfox.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viktor on 2017-05-10.
 */
public class Array implements ReturnArray {

  private List<Integer> numbers;
  private String what;
  private int result;

  private List<Integer> resultList = new ArrayList<>();

  public int getResult() {
    return result;
  }

  public String whatGetter() {
    return this.what;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public void sum() {
    if (what.equals("sum")) {
      int sum = 0;
      for (int i = 0; i < numbers.size(); i++) {
        sum += numbers.get(i);
      }
      result = sum;
    }
  }

  public void multiply() {
    if (what.equals("multiply")) {
      int multiply = 1;
      for (int i = 0; i < numbers.size(); i++) {
        multiply *= numbers.get(i);
      }
      result = multiply;
    }
  }

  public ArrayArray doubble() {
    if (what.equals("double")) {
      int doubble = 2;
      for (int i = 0; i < numbers.size(); i++) {
        doubble *= numbers.get(i);
        resultList.add(i, doubble);
        doubble = 2;
      }
    }
    return new ArrayArray(resultList);
  }
}
