/**
 * Created by hegyi on 2017-04-10.
 */
public class Skeleton extends Character {

  public Skeleton() {
    super(ImageLoader.getInstance().SKELETON);
    randomPosXandPosY();
    this.level = area.areaLevel;
    this.maxHP = 2 + level;
    this.currentHP = maxHP;
    this.maxSP = level * d6();
    this.maxDP = level / 2 * d6();
  }

  public String info() {
    return "Skeleton " + "HP: " + currentHP + "/" + maxHP + " | " + "DP: " + maxDP + " | " +
        "SP: " + maxDP;
  }
}
