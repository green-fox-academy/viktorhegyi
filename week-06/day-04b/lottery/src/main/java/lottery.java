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

    String valueOfY;
    String valueOfF;
    String valueOfO;

    if (options.has("y") && options.has("o") && options.has("f")) {
      valueOfY = options.valueOf("y").toString();
      valueOfF = options.valueOf("f").toString();
      valueOfO = options.valueOf("o").toString();
      writer(valueOfY, valueOfF, valueOfO);
    } else if (options.has("y") && options.has("f")) {
      valueOfY = options.valueOf("y").toString();
      valueOfF = options.valueOf("f").toString();
      valueOfO = "empty";
      writer(valueOfY, valueOfF, valueOfO);
    } else if (options.has("y") && options.has("o")) {
      valueOfY = options.valueOf("y").toString();
      valueOfF = "empty";
      valueOfO = options.valueOf("o").toString();
      writer(valueOfY, valueOfF, valueOfO);
    } else if  (options.has("y")) {
      valueOfY = options.valueOf("y").toString();
      valueOfF = "empty";
      valueOfO = "empty";
      writer(valueOfY, valueOfF, valueOfO);
    }
  }

  public static void writer(String first, String second, String third) {
    try {
      if( second.equals("empty")){
        second = "otos.csv";
      }
      if (third.equals("empty")) {
        third = "output.csv";
      }

      CSVReader reader = new CSVReader(new FileReader("src/main/java/" + second), ';');
      List<String[]> lines = reader.readAll();
      List<String[]> temp = new ArrayList<>();
        for ( String[] line : lines) {
          if ( line[0].equals(first)) {
            temp.add(line);
          }
        }
      CSVWriter writer = new CSVWriter(new FileWriter("src/main/java/" + third), ';', CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(temp);
      writer.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
