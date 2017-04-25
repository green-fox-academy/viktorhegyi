/**
 * Created by Viktor on 2017-04-24.
 */

import com.greenfox.bx.creditcard.CreditCard;
import java.util.ArrayList;
import java.util.List;

public class CreditCardApp {

  public static void main(String[] args) {
    List<CreditCard> list = new ArrayList<>();

    for (int i = 0; i < 10 ; i++) {
      CreditCard creditCard = new CreditCard();
      list.add(creditCard);
    }

    for (CreditCard card : list) {
      System.out.println(card);
    }
  }

}
