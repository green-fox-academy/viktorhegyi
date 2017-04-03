/**
 * Created by hegyi on 2017-04-03.
 */
public class Station {

  int gasAmount;

  public void refill(Car car) {
    gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }

}
