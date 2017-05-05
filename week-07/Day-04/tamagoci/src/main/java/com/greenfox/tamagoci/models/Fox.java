package com.greenfox.tamagoci.models;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-04.
 */
@Getter
@Component
public class Fox {

  private String name;
  List<Trick> listOfTricks;
  String actualFood;
  String actualDrink;

  public Fox() {
    this.name = "Mr. Green";
    listOfTricks = new ArrayList<>();
    this.actualFood = "sallad";
    this.actualDrink = "water";
  }

}
