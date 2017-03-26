/**
 * Created by hegyi on 2017-03-23.
 */
public class urlfixer {
  public static void main(String... args){
    String url = "https//www.reddit.com/r/nevertellmethebots";

    url = url.replace("bots", "odds");

    String fixedUrlFirstPart = url.substring(0, 5);
    String fixedUrlSecondPart = url. substring(5);

    url = fixedUrlFirstPart + ":" + fixedUrlSecondPart;

    // int whereTo =  = url.indexOf("/");
    // url = url.substring(0, whereTo) + ":" + url.substring(whereTo);

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    System.out.println(url);
  }

}
