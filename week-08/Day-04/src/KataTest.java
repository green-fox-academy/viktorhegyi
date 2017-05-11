import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * Created by Viktor on 2017-05-11.
 */
class KataTest {

  @Test
  public void KataTest(){
    assertEquals(true, Kata.anagram("aba", "aab"));
  }

  @Test
  public void KataTest2(){
    assertEquals(false, Kata.anagram("kata", "kaa"));
  }

  @Test
  public void KataTest3(){
    assertEquals(false, Kata.anagram("kata", "kala"));
  }

  @Test
  public void KataTest4() {
    assertEquals(true, Kata.anagram("Kata", "kata"));
  }

  @Test
  public void KataTest5() {
    assertEquals(true, Kata.anagram("Kata", "Ka ta"));
  }

  @Test
  public void KataTest6() {
    assertEquals(true, Kata.anagram(null, null));
  }

  @Test
  public void KataTest7() {
    assertEquals(false, Kata.anagram("kata", null));
  }

}