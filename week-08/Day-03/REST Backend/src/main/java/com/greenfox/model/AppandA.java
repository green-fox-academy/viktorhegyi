package com.greenfox.model;

/**
 * Created by Viktor on 2017-05-10.
 */
public class AppandA {

  private String appended;

  public AppandA(String input) {
    this.appended = input + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
