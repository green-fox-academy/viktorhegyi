/**
 * Created by hegyi on 2017-03-28.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){

    graphics.setColor(Color.GREEN);
    graphics.drawRect(5, 15, 30,50);
    graphics.setColor(Color.BLUE);
    graphics.drawRect(50, 80, 20,40);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(200, 200, 70,50);
    graphics.setColor(Color.YELLOW);
    graphics.drawRect(20, 200, 50,20);

    // draw four different size and color rectangles.
    
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