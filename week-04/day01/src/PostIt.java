/**
 * Created by hegyi on 2017-04-03.
 */
public class PostIt {

  String backgroundColor;
  String text;
  String textColor;

  @Override
  public String toString() {
    return "PostIt{" +
        "backgroundColor='" + backgroundColor + '\'' +
        ", text='" + text + '\'' +
        ", textColor='" + textColor + '\'' +
        '}';
  }

  public PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;

  }

  public static void main(String[] args) {
    PostIt first = new PostIt("orange", "Idea 1", "blue") ;
    PostIt second = new PostIt("pink", "Awesome", "black") ;
    PostIt third = new PostIt("yellow", "SuperB", "yellow") ;

    System.out.println(first.toString());
    System.out.println(second.toString());
    System.out.println(third.toString());
  }
}

