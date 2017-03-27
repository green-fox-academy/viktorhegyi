import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by hegyi on 2017-03-27.
 */
public class ReversedLines {

  public static void main(String[] args) {
    Path path = Paths.get("assets/reversed-lines.txt");

    try {
      List<String> text = Files.readAllLines(path);

      System.out.println(text);

      for ( String reversed : text) {
        String theSentence;
        for (int i = reversed.length() - 1; i > 0; i--) {
          theSentence = "" + reversed.charAt(i);
          System.out.print(theSentence);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
// Create a method that decrypts assets/reversed_zen_lines.txt