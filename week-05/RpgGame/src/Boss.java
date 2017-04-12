import java.awt.image.BufferedImage;

/**
 * Created by hegyi on 2017-04-10.
 */
public class Boss extends Character {

  public Boss() {
    super(ImageLoader.getInstance().BOSS);
    randomPosXandPosY();
  }

}
