/**
 * Created by hegyi on 2017-04-10.
 */
public class Monster extends Character {

  public Monster() {
    super(ImageLoader.getInstance().SKELETON);
    randomPosXandPosY();
  }

}
