package main.java.music;

/**
 * Created by Viktor on 2017-04-18.
 */
public class BassGuitar extends StringedInstrument  {

  public BassGuitar() {
    this.name = "Bass Guitar";
    this.numberOfStrings = 4;
    this.sound = "Duum-duum-duum";
  }

  public BassGuitar(int x) {
    this.name = "Bass Guitar";
    this.numberOfStrings = x;
    this.sound = "Duum-duum-duum";
  }

}
