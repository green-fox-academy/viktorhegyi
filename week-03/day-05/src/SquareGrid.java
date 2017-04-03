/**
 * Created by hegyi on 2017-03-31.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static void mainDraw(Graphics graphics) {
    int size = 600;
    fractual(graphics,size / 4,size / 4, size / 2);

  }
  private static void drawSquare (Graphics graphics, int x, int y, int size) {
    graphics.setColor(Color.BLACK);
    graphics.drawRect(x, y, size, size);
  }

  private static void fractual(Graphics graphics, int x, int y, int size) {
    if (size < 30) {
      return;
    } else {
      drawSquare(graphics, x, y, size);
      fractual(graphics, x - size / 4, y - size / 4, size / 2);
      fractual(graphics, x - size / 4, y + (size / 4) * 3, size / 2);
      fractual(graphics, x + (size / 4) * 3, y + (size / 4) * 3, size / 2);
      fractual(graphics, x + (size / 4) * 3, y - size / 4, size / 2);
    }
}

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 600));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}