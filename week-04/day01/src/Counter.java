/**
 * Created by hegyi on 2017-04-03.
 */
public class Counter {
  public int value = 0;
  public int number;

  public Counter() {
  }

  public Counter(int value) {
    this.number = value;
    this.value = value;
  }

  public void add(int number) {
    this.value += number;
  }

  public void add() {
    this.value++;
  }

  public int get() {
    return value;
  }

  public void reset() {
    value = number;


  }
}
