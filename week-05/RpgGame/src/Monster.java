import java.awt.image.BufferedImage;

/**
 * Created by hegyi on 2017-04-10.
 */
public class Monster extends Character {

  public Monster(int posX, int posY) {
    super(ImageLoader.getInstance().SKELETON, posX, posY);
  }

  public Monster() {
    super(ImageLoader.getInstance().SKELETON);
    this.posX = randomGenerator();
    this.posY = randomGenerator();
    if (posX == 0 && posY == 0 && isWall(posX,posY)) {
      this.posX = randomGenerator();
      this.posY = randomGenerator();
    }
    this.posX *= tileSize;
    this.posY *= tileSize;
  }

}
