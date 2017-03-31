/**
 * Created by hegyi on 2017-03-31.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

  public class Circles {

    public static void mainDraw(Graphics graphics){

      //drawCircle(graphics,0,0,0);
      drawFractals(graphics, 0, 0, 600);

    }

    private static void drawCircle (Graphics graphics, int x, int y, int size) {
      graphics.setColor(Color.black);
      graphics.drawOval(x, y, size, size);
      graphics.drawOval(x + size / 4, y, size / 2, size / 2);
      graphics.drawOval( x, y + size / 3, size / 2, size / 2);
      graphics.drawOval(x + size /2, y + size / 3, size / 2, size / 2);
    }

    private static void drawFractals(Graphics graphics, int x, int y, int size) {
      if (size < 1) {
        return;
      } else {
        drawCircle(graphics, x, y, size);
        drawFractals(graphics, x + size / 3, y, size / 3);
        drawFractals(graphics, x, y + size / 3, size / 3);
        drawFractals(graphics, x + size / 3 * 2, y + size / 3, size / 3);
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

