package countLetter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

/**
 * Created by hegyi on 2017-04-05.
 */
class CountLetterTest {

  @Test
  void countLetterMethod() {
      CountLetter countLetter = new CountLetter();
      String string = "Hello word";
      HashMap<Character, Integer> testHashMap = new HashMap<>();
      testHashMap.put('h', 1);
      testHashMap.put('e', 1);
      testHashMap.put('l', 2);
      testHashMap.put('o', 2);
      testHashMap.put(' ', 1);
      testHashMap.put('w', 1);
      testHashMap.put('r', 1);
      testHashMap.put('d', 1);
      assertEquals(testHashMap, countLetter.countLetterMethod(string));
    }
  }