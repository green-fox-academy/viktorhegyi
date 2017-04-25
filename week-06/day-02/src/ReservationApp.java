import com.greenfox.bx.reservation.Reservation;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viktor on 2017-04-24.
 */
public class ReservationApp {

  public static void main(String[] args) {

    List<Reservation> list = new ArrayList<>();

    for (int i = 0; i < 10 ; i++) {
      Reservation reservation = new Reservation();
      list.add(reservation);
    }

    for ( Reservation reservation : list) {
      System.out.println(reservation);
    }
  }

}
