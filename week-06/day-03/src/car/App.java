package car;

import java.util.ArrayList;

/**
 * Created by Viktor on 2017-04-19.
 */
public class App {

  public static void main(String[] args) {
    ArrayList<Car> parkingLot = new ArrayList<>();

    for (int i = 0; i < 256 ; i++) {
      Car car = new Car(randomTypeGenerator(), randomColorGenerator());
      parkingLot.add(car);
    }

    System.out.println(parkingLot);

  }

  public static Type randomTypeGenerator() {
    int random = (int) (Math.random() * 4);
    Type type;

    if ( random == 0) {
      type = Type.BMW;
    } else if ( random == 1) {
      type = Type.FERRARI;
    } else if ( random == 2) {
      type = Type.MERCEDES;
    } else {
      type = Type.OPEL;
    }

    return type;
  }

  public static Color randomColorGenerator() {
    int random = (int) (Math.random() * 4);
    Color color;

    if ( random == 0) {
      color = Color.BLACK;
    } else if ( random == 1) {
      color = Color.RED;
    } else if ( random == 2) {
      color = Color.GREEN;
    } else {
      color = Color.WHITE;
    }

    return color;
  }

}
