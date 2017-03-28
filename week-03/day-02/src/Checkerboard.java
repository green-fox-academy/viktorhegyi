/**
 * Created by hegyi on 2017-03-28.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

  public static void mainDraw(Graphics graphics) {

    int size = 30;

    for (int i = 0; i < 300; i = i + size * 2) {
      for (int j = size; j < 300; j = j + size * 2) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(i, j, size, size);
      }
    }
    for (int i = size; i < 300; i = i + size * 2) {
      for (int j = 0; j < 300; j = j + size * 2) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(i, j, size, size);
      }
    }
  }
  // fill the canvas with a checkerboard pattern.

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