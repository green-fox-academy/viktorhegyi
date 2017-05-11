import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by Viktor on 2017-05-11.
 */
class FizzBuzzTest {

  @Test
  public void fizzBuzzTest(){
    assertEquals("fizz", FizzBuzz.fizzBuzz(3));
  }

  @Test
  public void fizzBuzzTest2(){
    assertEquals("buzz", FizzBuzz.fizzBuzz(5));
  }

  @Test
  public void fizzBuzzTest3(){
    assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(15));
  }

  @Test
  public void fizzBuzzTest4(){
    assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(30));
  }

  @Test
  public void fizzBuzzTest5(){
    assertEquals("buzz", FizzBuzz.fizzBuzz(10));
  }

  @Test
  public void fizzBuzzTest6(){
    assertEquals("out of bound", FizzBuzz.fizzBuzz(105));
  }
}