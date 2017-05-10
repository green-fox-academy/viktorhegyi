package com.greenfox.model;

/**
 * Created by Viktor on 2017-05-10.
 */
public class Greeter {

  private String welcome_message;

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public Greeter(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

}
