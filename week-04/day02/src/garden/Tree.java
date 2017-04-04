package garden;

/**
 * Created by hegyi on 2017-04-04.
 */
public class Tree extends Plant {

  public Tree(String color) {
    this.color = color;
    this.plantsWaterAmount = 0;

    if (plantsWaterAmount < 10) {
      System.out.println("The " + color + " Tree " + "needs water.");
    } else {
      System.out.println("The " + color + " Tree " + " doesn`t need water.");

    }

  }

  public void needsWaterTree() {
    if (plantsWaterAmount > 5) {
      System.out.println("The " + color + " Tree " + " doesn`t need water.");
    } else {
      System.out.println("The " + color + " Tree " + "needs water.");

    }
  }
}