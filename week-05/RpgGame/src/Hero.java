/**
 * Created by hegyi on 2017-04-10.
 */
public class Hero extends Character{

  public Hero() {
    super(ImageLoader.getInstance().HERO_DOWN, 0, 0);
  }

  public void moveUp () {
    this.posY -= tileSize;
    setImage(ImageLoader.getInstance().HERO_UP);
  }

  public void moveDown () {
    this.posY += tileSize;
    setImage(ImageLoader.getInstance().HERO_DOWN);
  }

  public void moveRight () {
    this.posX += tileSize;
    setImage(ImageLoader.getInstance().HERO_RIGHT);
  }

  public void moveLeft () {
    this.posX -= tileSize;
    setImage(ImageLoader.getInstance().HERO_LEFT);
  }

}
