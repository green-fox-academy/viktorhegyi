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

  public Character(String filename, int posX, int posY) {
    super(filename, posX, posY);
  }

}
