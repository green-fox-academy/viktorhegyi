package garden;

import java.util.ArrayList;

/**
 * Created by hegyi on 2017-04-04.
 */
public class Garden {

  ArrayList<Plant> theGarden;


  public void watering(int wateringAmount) {
    System.out.println("Watering with " + wateringAmount);
  }

  public Garden() {
    theGarden = new ArrayList<>();
  }

  public void addFlower (Flower flower) {
    theGarden.add(flower);
  }

  public void addTree (Tree tree) {
    theGarden.add(tree);
  }

}
