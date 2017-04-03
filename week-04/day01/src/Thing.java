/**
 * Created by hegyi on 2017-04-03.
 */
public class Thing {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;

  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}