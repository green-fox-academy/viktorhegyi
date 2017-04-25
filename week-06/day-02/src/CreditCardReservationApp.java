/**
 * Created by Viktor on 2017-04-25.
 */

import com.greenfox.bx.CreditCardReservation;
import java.util.ArrayList;
import java.util.List;

public class CreditCardReservationApp {

  public static void main(String[] args) {

    List<CreditCardReservation> list = new ArrayList<>();

    for (int i = 0; i < 10 ; i++) {
      CreditCardReservation creditCardReservation = new CreditCardReservation();
      list.add(creditCardReservation);
    }

    for (CreditCardReservation creditCardReservation : list)
    System.out.println(creditCardReservation);
  }

}
