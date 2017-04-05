package countLetter;

import java.util.HashMap;
import java.util.List;

/**
 * Created by hegyi on 2017-04-05.
 */
public class CountLetter {

  public HashMap countLetterMethod(String theWord) {

    HashMap<Character,Integer> list = new HashMap<>();
    String copyOfWord = theWord.toLowerCase();

    for (int i = 0; i < copyOfWord.length() ; i++) {
      if (list.containsKey(copyOfWord.charAt(i))) {
        list.put(copyOfWord.charAt(i), list.get(copyOfWord.charAt(i))+1);
      } else {
        list.put(copyOfWord.charAt(i), 1);
      }
    }
    return list;
  }

}
