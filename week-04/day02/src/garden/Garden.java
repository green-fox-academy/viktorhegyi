package garden;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hegyi on 2017-04-04.
 */
public class Garden {

  int watercount = 0;

  List<Plant> myGarden = new ArrayList<>();

  public void addFlowers(Flower flower) {
    this.myGarden.add(flower);
  }

  public void addTrees(Tree tree) {
    this.myGarden.add(tree);
  }

  public void info() {
    for (Plant plant : myGarden) {
      if (plant.waterState < plant.waterNeed) {
        System.out.println("The " + plant.getColor() + " " + plant.type +
            " needs water.");
      } else {
        System.out.println("The " + plant.getColor() + " " + plant.type
            + " doesn't need water.");
      }
    }
    System.out.println();
  }

  public void watering(int waterAmount) {

    watercount = 0;

    System.out.println("Watering with: " + waterAmount );

    for (Plant plant : myGarden) {
      if (plant.waterState < plant.waterNeed) {
        watercount++;
      }
    }

    for (Plant plant : myGarden) {
      if (plant.waterState < plant.waterNeed) {
        plant.waterState += ((waterAmount / watercount) * plant.waterAbsorption);
      }
    }
  }
}