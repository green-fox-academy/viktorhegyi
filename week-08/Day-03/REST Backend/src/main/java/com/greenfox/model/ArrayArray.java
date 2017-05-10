package com.greenfox.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viktor on 2017-05-10.
 */
public class ArrayArray implements ReturnArray {

  private List<Integer> numbers;
  private String what;

  private List<Integer> result = new ArrayList<>();

  public ArrayArray(List<Integer> listArray) {
    this.result = listArray;
  }

  public List<Integer> getResult() {
    return result;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public void setWhat(String what) {
    this.what = what;
  }

}
