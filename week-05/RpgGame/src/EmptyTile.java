/**
 * Created by hegyi on 2017-04-11.
 */
public class EmptyTile extends GameObject {

  public EmptyTile(int x, int y) {
    super(ImageLoader.getInstance().FLOOR, x, y);
  }

}
