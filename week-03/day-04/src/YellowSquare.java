/**
 * Created by hegyi on 2017-03-30.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowSquare {

  public static void mainDraw(Graphics graphics){

    drawFractals(graphics,0, 0, 600);
  }

  private static void drawLine(Graphics graphics, int x, int y, int size) {
    graphics.setColor(Color.black);
    graphics.drawLine(x + size / 3, y, x + size / 3, y + size);
    graphics.drawLine(x + size / 3 * 2, y, x + size / 3 * 2, y + size);
    graphics.drawLine(x, y + size / 3, x + size, y + size / 3);
    graphics.drawLine(x, y + size / 3 * 2, x + size, y + size / 3 * 2);
          }

  private static void drawFractals(Graphics graphics, int x, int y, int size) {
    if (size < 1) {
      return;
    } else {
      drawLine(graphics, x, y, size);
      drawFractals(graphics, x + (size / 3), y, size / 3);
      drawFractals(graphics, x, y + (size / 3), size / 3);
      drawFractals(graphics, x + ((size / 3) * 2), y + (size / 3), size / 3);
      drawFractals(graphics, x + (size / 3), y + ((size / 3) * 2), size / 3);
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
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);

    }
  }

}