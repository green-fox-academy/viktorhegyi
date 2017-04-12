import java.awt.Color;
import java.awt.Graphics;

/**
 * Created by hegyi on 2017-04-12.
 */
public class Hub {

  public void drawHub(Graphics graphics) {
    fillBackground(graphics);
    graphics.setColor(Color.BLACK);
  }

  public void fillBackground(Graphics graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 720, 720, 50);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(0,720,720,50);
  }
}
