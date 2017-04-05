package extension;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * Created by hegyi on 2017-04-05.
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd() {
    assertEquals(6, extension.add(3,3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testAddNumbers() {
    assertEquals(10, extension.add(1, 9));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_second() {
    assertEquals(6, extension.maxOfThree(5, 6, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  void testMedian() {
    assertEquals(25, extension.median(Arrays.asList(10,20,30,40)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testMedian_fiveAgain() {
    assertEquals(6, extension.median(Arrays.asList(1,3,5,7,9,11)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  void testTranslate_tryToFail() {
    assertEquals("hevellovo mivizuvu", extension.translate("hello mizu"));
  }


}