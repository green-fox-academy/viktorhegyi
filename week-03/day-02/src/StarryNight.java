/**
 * Created by hegyi on 2017-03-28.
 */
    import javax.swing.*;

    import java.awt.*;

    import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {

  public static void mainDraw(Graphics graphics){

    for (int i = 0; i < 20 ; i++) {
      stars(graphics);
    }
  }

  private static void stars(Graphics graphics) {
    int random = 100 + (int) (Math.random() * 150);
    graphics.setColor(new Color(random,random,random));
    int randomPositionX = (int) (Math.random() * 300);
    int randomPositionY = (int) (Math.random() * 300);

    graphics.fillRect(randomPositionX, randomPositionY, 2,2);
  }
  // draw the night sky:
  // - The background should be black
  // - The stars can be small squares
  // - The stars should have random positions on the canvas
  // - The stars should have random color (some shade of grey)

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
      this.setBackground(Color.black);
      mainDraw(graphics);

    }
  }

}