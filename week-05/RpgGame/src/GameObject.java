
/**
 * Created by hegyi on 2017-04-10.
 */
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameObject{
  BufferedImage image;
  int posX, posY;

  public GameObject(BufferedImage image, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    setImage(image);
  }

  public GameObject() {
  }

  public GameObject(BufferedImage image) {
    setImage(image);
  }

  protected void setImage(BufferedImage image) {
    this.image = image;
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }
}