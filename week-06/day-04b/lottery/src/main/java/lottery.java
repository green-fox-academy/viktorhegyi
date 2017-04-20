import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

/**
 * Created by Viktor on 2017-04-20.
 */
public class lottery {
  public static void main(String[] args) {
    argumentHandler(args);


  }

  public static void argumentHandler(String[] args) {
    OptionParser parser = new OptionParser();
    parser.accepts("y").withRequiredArg();
    parser.accepts("f").withRequiredArg();
    parser.accepts("o").withRequiredArg();

    OptionSet options = parser.parse(args);

    if (options.has("y")) {
      String valueOfY = options.valueOf("y").toString();
      writer(valueOfY);

      System.out.println("`-y` was given with the argument " + options.valueOf("y"));
    }

    if (options.has("f")) {
      System.out.println("`-l` was given with the no additional information.");
    }

    if (options.has("o")) {
      System.out.println("`-l` was given with the no additional information.");
    }
  }

  public static void writer(String input) {
    try {
      CSVReader reader = new CSVReader(new FileReader("src/main/java/otos.csv"), ';');
      List<String[]> lines = reader.readAll();
      List<String[]> temp = new ArrayList<>();
        for ( String[] line : lines) {
          if ( line[0].equals(input)) {
            temp.add(line);
          }
        }
      CSVWriter writer = new CSVWriter(new FileWriter("src/main/java/output.csv"), ';', CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(temp);
      writer.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
