package main.java.music;

/**
 * Created by Viktor on 2017-04-18.
 */
public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;
  String sound;
  String name;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  public StringedInstrument() {
  }

  public StringedInstrument(int x) {
    this.numberOfStrings = x;
  }
  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
}
