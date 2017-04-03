/**
 * Created by hegyi on 2017-04-03.
 */
public class Sharpie {

  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100f;
  }

  public void use() {
    inkAmount--;
  }

  boolean isUsable() {
    return inkAmount > 0;
  }
}
