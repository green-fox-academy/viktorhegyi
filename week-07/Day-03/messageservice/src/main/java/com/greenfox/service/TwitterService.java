package com.greenfox.service;

/**
 * Created by Viktor on 2017-05-04.
 */
public class TwitterService implements MessageService {

  @Override
  public void show(String s, String s1) {
    System.out.println("Tweet Sent to " + s1 + " with Message= " + s);
  }
}
