package markerannotation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viktor on 2017-04-26.
 */
public class App {
  public static void main(String[] args) {

    List<Screen> screens = new ArrayList<>();
    screens.add(new Screen43(ScreenSize.INCH15));
    screens.add(new Screen43(ScreenSize.INCH21));
    screens.add(new Screen43(ScreenSize.INCH25));
    screens.add(new Screen169(ScreenSize.INCH19));
    screens.add(new Screen169(ScreenSize.INCH21));
    screens.add(new Screen169(ScreenSize.INCH29));
    screens.add(new Screen219(ScreenSize.INCH19));
    screens.add(new Screen219(ScreenSize.INCH23));
    screens.add(new Screen219(ScreenSize.INCH34));

    for (Screen screen : screens){
      System.out.println(screen);
    }
  }
}
