import java.awt.image.BufferedImage;

/**
 * Created by hegyi on 2017-04-10.
 */
public class Monster extends Character {

  public Monster(int posX, int posY) {
    super(ImageLoader.getInstance().SKELETON, posX, posY);
  }

  public int randomPosXGenerator() {
    int randomPosX = (int) ((Math.random() * 10));
    randomPosX = randomPosX * tileSize;
    System.out.println(randomPosX);
    return randomPosX;
  }

  public int randomPosYGenerator() {
    int randomPosY = (int) ((Math.random() * 10));
    randomPosY = randomPosY * tileSize;
    System.out.println(randomPosY);
    return randomPosY;
  }

  public Monster() {
    super(ImageLoader.getInstance().SKELETON);
    this.posX = randomPosXGenerator();
    this.posY = randomPosYGenerator();
  }
}
