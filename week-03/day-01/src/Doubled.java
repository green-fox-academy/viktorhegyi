import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by hegyi on 2017-03-27.
 */
public class Doubled {

  public static void main(String[] args) {
    Path paths = Paths.get("assets/duplicated-chars.txt");

    try {
      List<String> text = Files.readAllLines(paths);

      System.out.println(text);

      for ( String letters : text) {
        String theSentence;
        for (int i = 0; i < letters.length() ; i++) {
          if ( i % 2 == 0) {
            theSentence = "" + letters.charAt(i);
            System.out.print(theSentence);
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}


// Create a method that decrypts the assets/duplicated_chars.txt
