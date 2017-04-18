package main.java.music;

/**
 * Created by Viktor on 2017-04-18.
 */
public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this.name = "Electric Guitar";
    this.numberOfStrings = 6;
    this.sound = "twangs";
  }

  public ElectricGuitar(int x) {
    this.name = "Electric Guitar";
    this.numberOfStrings = x;
    this.sound = "twangs";
  }
}
