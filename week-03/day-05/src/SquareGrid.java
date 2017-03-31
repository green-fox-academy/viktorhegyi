/**
 * Created by hegyi on 2017-03-31.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static void mainDraw(Graphics graphics) {

    fractual(graphics,0,0, 600);

  }
  private static void drawSquare (Graphics graphics, int x, int y, int size) {
    graphics.setColor(Color.BLACK);
    graphics.drawRect(x + size / 4, y + size / 4, size / 2, size / 2);
  }

  private static void fractual(Graphics graphics, int x, int y, int size) {
    if (size < 1) {
      return;
    } else {
      drawSquare(graphics, x, y, size);
      fractual(graphics, x + size / 8, y + size / 8, size / 4 );
      //fractual(graphics, (x + size / 8) * 5, y + size / 8, size / 4) ;
      //fractual(graphics, x + size /8, (y + size / 8) * 5, size / 4);
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