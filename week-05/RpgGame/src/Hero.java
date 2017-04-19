/**
 * Created by hegyi on 2017-04-10.
 */
public class Hero extends Character{

  public Hero() {
    super(ImageLoader.getInstance().HERO_DOWN, 0, 0);
    this.level = 1;
    this.maxHP = 20 + 3 * d6();
    this.currentHP = maxHP;
    this.currentDP = 2 * d6();
    this.currentSP = 5 + d6();
  }

  public String info() {
    return  "Hero " + "(Level " + level + ") " + "HP: " + currentHP + "/" + maxHP +
        " | " + "DP: " + currentDP + " | " + "SP: " + currentSP;
  }

}
