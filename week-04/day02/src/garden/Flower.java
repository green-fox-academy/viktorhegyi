package garden;

/**
 * Created by hegyi on 2017-04-04.
 */
public class Flower extends Plant {

  public Flower (String color) {
    this.color = color;
    this.plantsWaterAmount = 0;

    if (plantsWaterAmount < 5 ) {
      System.out.println("The " + color + " Flower " + "needs water.");
    } else {
      System.out.println("The " + color + " Flower " + " doesn`t need water.");

    }
  }

  public void needsWaterFlower() {
    if ( plantsWaterAmount > 5) {
      System.out.println("The " + color + " Flower " + " doesn`t need water.");
    } else {
      System.out.println("The " + color + " Flower " + "needs water.");
    }
  }




}
