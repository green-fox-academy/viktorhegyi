package com.greenfox.model;

import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-10.
 */
public class OutPutNumber {

  int received;
  int result;

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public OutPutNumber(int received, int result) {
    this.received = received;
    this.result = result;
  }


}