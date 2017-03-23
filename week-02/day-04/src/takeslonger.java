/**
 * Created by hegyi on 2017-03-23.
 */
public class takeslonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";


    StringBuilder fixedQuote = new StringBuilder(quote);
    int it = quote.indexOf("you");
    fixedQuote.insert(it, "always takes longer than ");

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    System.out.println(fixedQuote);
  }

}
