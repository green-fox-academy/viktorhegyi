/**
 * Created by hegyi on 2017-03-28.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

  public static void mainDraw(Graphics graphics){

    int[] boxX = {10, 290, 290, 10};
    int[] boxY = {10, 10, 290, 290};
    int boxLength = boxX.length;

    int[] lineX = {50, 70, 80, 90, 100, 120, 85, 50};
    int[] lineY = {100, 70, 90, 90, 70, 100, 130, 100};
    int length = lineX.length;

    draw(boxX, boxY, boxLength, graphics);
    draw(lineX, lineY, length, graphics);
  }

  private static void draw(int[] x, int[] y, int lenght, Graphics graphics) {
    graphics.setColor(Color.GREEN);
    graphics.drawPolyline(x, y, lenght);
  }
  // create a function that takes 1 parameter:
  // an array of {x, y} points
  // and connects them with green lines.
  // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
  // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
  // {120, 100}, {85, 130}, {50, 100}}

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