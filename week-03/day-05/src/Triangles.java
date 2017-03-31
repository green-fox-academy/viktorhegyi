/**
 * Created by hegyi on 2017-03-31.
 */

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

  public class Triangles {

    public static void mainDraw(Graphics graphics){

      drawFractals(graphics, 450, 600, 300);

    }
    public static int random() {
      int color = (int) (Math.random() * 16777216);
      return color;
    }

    private static void drawTriangles (Graphics graphics, int x, int y, int lenght) {
      graphics.setColor(Color.black);
      int[] first = {x, x + lenght, x - lenght};
      int[] second = {y, y - lenght * 2, y - lenght * 2};
      graphics.setColor(new Color(random()));
      graphics.drawPolygon(first,second,3);
    }

    private static void drawFractals(Graphics graphics, int x, int y, int lenght) {
      if (lenght < 1) {
        return;
      } else {
        drawTriangles(graphics, x, y, lenght);
        drawFractals(graphics, x, y, lenght /2);
        drawFractals(graphics, x - lenght / 2, y - lenght, lenght /2);
        drawFractals(graphics, x + lenght / 2, y - lenght, lenght /2);
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
    static class ImagePanel extends JPanel {
      @Override
      protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        mainDraw(graphics);

      }
    }
  }

