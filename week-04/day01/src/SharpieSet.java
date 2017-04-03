import java.util.ArrayList;

/**
 * Created by hegyi on 2017-04-03.
 */
public class SharpieSet {
  ArrayList<Sharpie> sharpies;

  public SharpieSet() {
    sharpies = new ArrayList<>();
  }

  int countUsable() {
    int usableSharpies = 0;
    for (Sharpie s : sharpies) {
      if (s.inkAmount > 0) {
        usableSharpies++;
      }
    }
    return usableSharpies;
  }

  void removeTrash() {
    for (int i = 0; i < sharpies.size() ;) {
      if (!sharpies.get(i).isUsable()) {
        sharpies.remove(i);
      } else {
        i++;
      }
    }
  }
}
