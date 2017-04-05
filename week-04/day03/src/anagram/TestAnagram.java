package anagram;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

/**
 * Created by hegyi on 2017-04-05.
 */
public class TestAnagram {

  String one = "bb b";
  String two = "bbb";
  Anagram test = new Anagram();

  @Test
  public void testAnagramMethod() {
    assertEquals(true, test.testAnagram(one,two) );
  }

}
