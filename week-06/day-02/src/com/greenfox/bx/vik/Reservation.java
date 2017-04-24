package com.greenfox.bx.vik;
import java.util.ArrayList;

/**
 * Created by Viktor on 2017-04-24.
 */
public class Reservation implements Reservationy{

  @Override
  public String getDowBooking() {
    String randomDayOutput = randomDay();
    return randomDayOutput;
  }

  @Override
  public String getCodeBooking() {
    String random = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    String bowBooking = "";

    for (int i = 0; i < 8 ; i++) {
      char addTo = random.charAt(randomNumberGenerator());
      bowBooking += "" + addTo;
    }
    return bowBooking;
  }

  @Override
  public String toString () {
    return String.format("Booking# %s for %s", getCodeBooking(), getDowBooking());
  }

  public int randomNumberGenerator() {
    int randomNumber = (int)(Math.random() * 36);
    return randomNumber;
  }

  public String randomDay() {
    ArrayList<String> randomDay = new ArrayList<>();
    randomDay.add("MON");
    randomDay.add("TUE");
    randomDay.add("WED");
    randomDay.add("THU");
    randomDay.add("FRI");
    randomDay.add("SAT");
    randomDay.add("SUN");
    int randomNumber = (int)(Math.random() * 6 );
    return randomDay.get(randomNumber);
  }

}
