/**
 * Created by hegyi on 2017-04-10.
 */
public class Boss extends Character {

  public Boss() {
    super(ImageLoader.getInstance().BOSS);
    randomPosXandPosY();
    this.level = area.areaLevel;
    this.maxHP = 2 + level * d6();
    this.currentHP = maxHP;
    this.maxDP = level/2 * d6() + (d6() /2);
    this.maxSP = level * d6() + level;
  }

  public String info() {
    return "Skeleton " + "HP: " + currentHP + "/" + maxHP + " | " + "DP: " + maxDP + " | " +
        "SP: " + maxDP;
  }
}
