import java.awt.image.BufferedImage;

/**
 * Created by hegyi on 2017-04-10.
 */
public class Character extends GameObject {
  public int currentHP;
  int currentDP;
  int currentSP;
  int maxHP;
  int maxDP;
  int maxSP;
  int level = 1;

  Area area = new Area();

  public Character(BufferedImage image, int posX, int posY) {
    super(image, posX, posY);
  }

  public Character(BufferedImage image) {
    super(image);
  }

  public int randomGenerator() {
    int randomPos = (int) ((Math.random() * 10));
    return randomPos;
  }

  public void randomPosXandPosY() {
    this.posX = randomGenerator();
    this.posY = randomGenerator();
    while (isWall(posX,posY)) {
      this.posX = randomGenerator();
      this.posY = randomGenerator();
    }
    this.posX *= tileSize;
    this.posY *= tileSize;
  }

  boolean isWall(int x, int y) {
    if ((area.wallPositions[x][y]).equals("1")) {
      return true;
    } else {
      return false;
    }
  }

}
