/**
 * Created by hegyi on 2017-03-28.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics){

    for (int i = 10; i < 150; i += 10) {
      drawLine(i, 150, 150, 150 - i, graphics);
      drawLine(i, 150, 150, 150 + i, graphics);
      drawLine(150, i, 150 + i, 150, graphics);
      drawLine(150, 150 + i, 300 - i, 150, graphics);
    }
    drawLine(150,0,150, 300, graphics);
  }

  private static void drawLine(int x, int y, int a, int b, Graphics graphics) {
    graphics.setColor(Color.GREEN);
    graphics.drawLine(x, y, a, b);
  }

  // reproduce this:
  // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/envelope-star/r2.png]

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