package garden;

/**
 * Created by hegyi on 2017-04-04.
 */
public class Flower extends Plant {

  public Flower(String color) {
    super.color = color;
    super.waterState = 0;
    this.waterAbsorption = 0.75;
    this.waterNeed = 5;
    super.type = "flower";
  }
}