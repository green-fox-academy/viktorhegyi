import java.awt.image.BufferedImage;

/**
 * Created by hegyi on 2017-04-10.
 */
public class Boss extends Character {

  public Boss() {
    super(ImageLoader.getInstance().BOSS);
    this.posX = randomGenerator();
    this.posY = randomGenerator();
    if (posX == 0 && posY == 0) {
      this.posX = randomGenerator();
      this.posY = randomGenerator();
    }
    this.posX *= tileSize;
    this.posY *= tileSize;
  }

}
