/**
 * Created by hegyi on 2017-03-28.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

  public static void mainDraw(Graphics graphics){
    for (int i = 0; i < 300 ; i = i + 20) {
      for (int j = 0; j <300 ; j = j + 20) {
        drawToCenter(j,300,graphics);
        drawToCenter(300,j,graphics);
      }
        drawToCenter(i,0,graphics);
        drawToCenter(0,i,graphics);
      }
    }
  
  private static void drawToCenter(int x, int y, Graphics graphics) {
    int centerX = 150;
    int centerY = 150;

    graphics.setColor(Color.BLACK);
    graphics.drawLine(x,y, centerX,centerY);

  }
  // create a line drawing function that takes 2 parameters:
  // the x and y coordinates of the line's starting point
  // and draws a line from that point to the center of the canvas.
  // fill the canvas with lines from the edges, every 20 px, to the center.


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