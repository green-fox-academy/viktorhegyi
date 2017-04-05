package anagram;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by hegyi on 2017-04-05.
 */
class AnagramTest {

  String one = "bb b";
  String two = "bbb";
  Anagram test = new Anagram();

  @org.junit.jupiter.api.Test
  void testAnagram() {
    assertTrue(test.testAnagram(one, two));
  }

}