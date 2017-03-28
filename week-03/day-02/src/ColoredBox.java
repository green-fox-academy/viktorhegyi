/**
 * Created by hegyi on 2017-03-28.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics){

    graphics.setColor(Color.RED);
    graphics.drawLine(30, 30, 30, 100);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(30,100, 100, 100);
    graphics.setColor(Color.BLUE);
    graphics.drawLine(100, 100, 100, 30);
    graphics.setColor(Color.MAGENTA);
    graphics.drawLine(100, 30, 30, 30);
    // draw a box that has different colored lines on each edge.



  }

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