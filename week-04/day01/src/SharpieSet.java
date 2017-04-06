import java.util.ArrayList;

/**
 * Created by hegyi on 2017-04-03.
 */
public class SharpieSet {
  ArrayList<Sharpie> sharpies;

  public SharpieSet() {
    this.sharpies = new ArrayList<>();
  }

  int countUsable() {
    int usableSharpies = 0;
    for (Sharpie usable : sharpies) {
      if (usable.isUsable()) {
        usableSharpies++;
      }
    }
    return usableSharpies;
  }

  void removeTrash() {
    for (int i = 0; i < sharpies.size();) {
      if (!sharpies.get(i).isUsable()) {
        sharpies.remove(i);
      }
      else
        i++;
    }
  }
}