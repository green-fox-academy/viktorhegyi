/**
 * Created by hegyi on 2017-04-02.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

  public static void mainDraw(Graphics graphics) {

    fractual(graphics, 100, 100, 100);
  }

  private static void drawRect (Graphics graphics,int x, int y, int size) {
    graphics.fillRect(x, y, size, size);
  }

  private static void fractual(Graphics graphics, int x, int y, int size) {
    if (size < 1) {
      return;
    } else {
      drawRect(graphics, x, y, size);
      fractual(graphics,x-size/3*2, y-size/3*2, size/3);
      fractual(graphics,x+size/3, y-size/3*2, size/3 );
      fractual(graphics,x+size+size/3, y-size/3*2, size/3  );
      fractual(graphics,x-size/3*2, y+size+size/3, size/3  );
    }
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

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}

