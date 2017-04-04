package garden;

/**
 * Created by hegyi on 2017-04-04.
 */
public class Tree extends Plant {

  public Tree(String color) {
    super.color = color;
    super.waterState = 0;
    this.waterAbsorption = 0.4;
    this.waterNeed = 10;
    super.type = "tree";
  }
}