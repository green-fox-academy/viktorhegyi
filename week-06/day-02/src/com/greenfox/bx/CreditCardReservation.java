package com.greenfox.bx;
import com.greenfox.bx.creditcard.CreditCard;
import com.greenfox.bx.creditcard.CreditCardy;
import com.greenfox.bx.reservation.Reservation;
import com.greenfox.bx.reservation.Reservationy;

/**
 * Created by Viktor on 2017-04-25.
 */
public class CreditCardReservation implements Reservationy, CreditCardy{

  private String name;
  private int number;
  private int sum;
  private String account;
  private static int counter = 0;

  CreditCard creditCard = new CreditCard();
  Reservation reservation = new Reservation();

  public CreditCardReservation() {
    this.number = counter++;
    this.name = "DEF" + number ;
    this.account = getCodeAccount();
    this.sum = cumeSumCVV(account);
  }

  @Override
  public String toString () {
    return String.format("Booking# %s for %s paid by Name=%s CC#=%s CVV=%d",
        getCodeBooking(), getDowBooking(), getNameCardholder(), getCodeAccount(), getSumCVV());
  }

  @Override
  public int getSumCVV() {
    return sum;
  }

  @Override
  public String getNameCardholder() {
    return name;
  }

  @Override
  public String getCodeAccount() {
    return creditCard.getCodeAccount();
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    return creditCard.cumeSumCVV(codeAccount);
  }

  @Override
  public String getDowBooking() {
    return reservation.getDowBooking();
  }

  @Override
  public String getCodeBooking() {
    return reservation.getCodeBooking();
  }
}
