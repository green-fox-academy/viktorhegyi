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

    sameTypeCounter(parkingLot);
    sameColorCounter(parkingLot);
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

  public static void sameTypeCounter(ArrayList<Car> list) {
    int counterBMW = 0;
    int counterOpel = 0;
    int counterMercedes = 0;
    int counterFerrari = 0;

    for ( Car car : list ) {
      if ( car.type == Type.BMW ) {
        counterBMW++;
      } else if ( car.type == Type.OPEL) {
        counterOpel++;
      } else if ( car.type == Type.MERCEDES) {
        counterMercedes++;
      } else if ( car.type == Type.FERRARI) {
        counterFerrari++;
      }
    }
    System.out.println("BMW: " + counterBMW + " Ferrari: " + counterFerrari + " Opel: " + counterOpel +
                      " Mercedes: " + counterMercedes);
  }

  public static void sameColorCounter(ArrayList<Car> list) {
    int counterBlack = 0;
    int counterRed = 0;
    int counterWhite = 0;
    int counterGreen = 0;

    for ( Car car : list ) {
      if ( car.color == Color.BLACK ) {
        counterBlack++;
      } else if ( car.color == Color.WHITE) {
        counterWhite++;
      } else if ( car.color == Color.GREEN) {
        counterGreen++;
      } else if ( car.color == Color.RED) {
        counterRed++;
      }
    }
    System.out.println("Black: " + counterBlack + " Red: " + counterRed + " White: " +
                        counterWhite + " Green: " + counterGreen);
  }
}
