package car;

/**
 * Created by Viktor on 2017-04-19.
 */
public class Car {

  Type type;
  Color color;

  @Override
  public String toString() {
    return "{ " + type + " " + color + " }";
  }

  public Car(Type type, Color color) {
    this.type = type;
    this.color = color;
  }


}
