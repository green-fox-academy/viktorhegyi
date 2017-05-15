package com.greenfox.model;

import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-15.
 */
@Component
public class Yondu {

  private double distance;
  private double time;
  private double speed;

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed() {
    this.speed = distance / time;
  }


}
