import java.awt.image.BufferedImage;

/**
 * Created by hegyi on 2017-04-10.
 */
public class Character extends GameObject {
  int currentHP;
  int currentDP;
  int currentSP;
  int maxHP;
  int maxDP;
  int maxSP;
  boolean death = false;
  int tileSize = 72;
  int canvasSise = 720;
  int[] random = new int[2];

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
    while (getWallInfo(posX,posY)) {
      this.posX = randomGenerator();
      this.posY = randomGenerator();
    }
    this.posX *= tileSize;
    this.posY *= tileSize;

  }

  boolean getWallInfo(int x, int y) {
    if ((area.wallPositions[x][y]).equals("1")) {
      return true;
    } else {
      return false;
    }
  }

}
