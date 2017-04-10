
/**
 * Created by hegyi on 2017-04-10.
 */
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameObject {

  BufferedImage image;
  int posX, posY;

  public GameObject(String filename, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    setImage(filename);
  }

  protected void setImage(String filename) {
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }
}