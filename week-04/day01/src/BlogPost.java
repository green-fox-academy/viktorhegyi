/**
 * Created by hegyi on 2017-04-03.
 */
public class BlogPost {

  String authorName;
  String title;
  String text;
  String publicitonDate;

  public BlogPost (String authorName, String title, String text, String publicitonDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicitonDate = publicitonDate;
  }

  @Override
  public String toString() {
    return "BlogPost{" +
        "authorName='" + authorName + '\'' +
        ", title='" + title + '\'' +
        ", text='" + text + '\'' +
        ", publicitonDate='" + publicitonDate + '\'' +
        '}';
  }

  public static void main(String[] args) {
    BlogPost one = new BlogPost("John Doe",
                                "Lorem Ipsum",
                                "Lorem ipsum dolor sit amet.",
                                "2000.05.04.");
    BlogPost two = new BlogPost("Tim Urban",
                                "Wait but why",
                                "A popular long-form, stick-figure-illustrated blog about almost everything.",
                                 "2010.10.10.");
    BlogPost three = new BlogPost("William Turton",
                                   "One Engineer Is Trying to Get IBM to Reckon With Trump",
                                  "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. "
                                      + "When I asked to take his picture outside one of IBM’s New York City offices, "
                                      + "he told me that he wasn’t really into the whole organizer profile thing.",
                                   "2017.03.28.");

    System.out.println(one.toString());
    System.out.println(two.toString());
    System.out.println(three.toString());

  }
}
