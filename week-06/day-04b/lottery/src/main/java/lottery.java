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

    String year = options.valueOf("y").toString();
    String input = options.has("f") ? options.valueOf("f").toString() : "otos.csv";
    String output = options.has("o") ? options.valueOf("o").toString() : "output.csv";

    writer(year,input,output);
 }

  public static void writer(String year, String input, String output) {
    try {
      CSVReader reader = new CSVReader(new FileReader("src/main/java/" + input), ';');
      List<String[]> lines = reader.readAll();
      List<String[]> temp = new ArrayList<>();
        for ( String[] line : lines) {
          if ( line[0].equals(year)) {
            temp.add(line);
          }
        }
      CSVWriter writer = new CSVWriter(new FileWriter("src/main/java/" + output), ';', CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(temp);
      writer.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
