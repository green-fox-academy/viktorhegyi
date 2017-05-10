package com.greenfox.model;

/**
 * Created by Viktor on 2017-05-10.
 */
public class DoUntil {

  private int result;
  private int until;

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void sum(){
    int sum = 0;
    for (int i = 1; i <= until ; i++) {
      sum += i;
    }
    result = sum;
  }

  public void factor() {
    int factorial = 1;
    for (int i = 1; i <= until; i++) {
      factorial *= i;
    }
    result = factorial;
  }

}

