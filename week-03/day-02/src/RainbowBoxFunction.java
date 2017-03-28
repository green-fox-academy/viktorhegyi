/**
 * Created by hegyi on 2017-03-28.
 */
import java.awt.Color;
import javafx.scene.paint.*;
import javax.swing.*;

import java.awt.*;
import org.w3c.dom.css.RGBColor;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static void mainDraw(Graphics graphics){

    draw(20,200000,graphics);
    }
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.

  private static void draw(int size, int color, Graphics graphics) {
    int x = 300;
    int random = color;

    while ( x > size) {
      graphics.setColor(new Color(random));
      graphics.fillRect(150 - x / 2, 150 - x/ 2, x, x);
      x = x - 20;
      random = (int) (Math.random() * 16777215);
    }

    graphics.setColor(new Color(random));
    graphics.fillRect((150 -(size/2)), (150 - (size/2)), size, size);

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