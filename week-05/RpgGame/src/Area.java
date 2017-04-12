import java.awt.Graphics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by hegyi on 2017-04-10.
 */
public class Area extends GameObject{

  String[][] wallPositions = new String[10][10];
  int size;
  Path path;

  public Area() {
    readBoard("assets/wallposition.csv");
  }

  public void readBoard(String in) {
    this.path = Paths.get("assets/wallposition.csv");
    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        String[] line = lines.get(i).split(";");
        wallPositions[i] = line;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  boolean getWallInfo(int x, int y) {
    if ((wallPositions[x][y]).equals("1")) {
        return true;
    } else {
      return false;
    }
  }

  void drawBoard(Graphics graphics) {
    size = 72;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (!getWallInfo(i, j)) {
          EmptyTile emptyTile = new EmptyTile(i * size,j * size);
          emptyTile.draw(graphics);
        } else {
          NotEmptyTile notEmptyTile = new NotEmptyTile(i * size,j * size);
          notEmptyTile.draw(graphics);
        }
      }
    }
  }

}
