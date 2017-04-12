/**
 * Created by hegyi on 2017-04-10.
 */
public class Monster extends Character {

  public Monster(int posX, int posY) {
    super(ImageLoader.getInstance().SKELETON, posX, posY);
  }

  public Monster() {
    super(ImageLoader.getInstance().SKELETON);
    randomPosXandPosY();
  }

}
