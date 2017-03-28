/**
 * Created by hegyi on 2017-03-28.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static void mainDraw(Graphics graphics){

    for (int i = 0; i < 300 ; i += 20) {
      drawLine(i, 0, 300, i + 20, graphics);
      }
    for (int i = 0; i < 300 ; i += 20) {
      drawGreenLine(0, i, i + 20, 300, graphics);
    }
  }

    private static void drawLine(int x, int y, int a, int b, Graphics graphics) {
      graphics.setColor(Color.MAGENTA);
      graphics.drawLine(x, y, a, b);
    }

    private static void drawGreenLine(int x, int y, int a, int b, Graphics graphics) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(x, y, a, b);
    }

    // reproduce this:
  // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
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