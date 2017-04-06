import java.util.ArrayList;
import java.util.List;

/**
 * Created by hegyi on 2017-04-05.
 */
public class Blog {

  ArrayList<BlogPost> listOfBlogs;

  public Blog() {
    listOfBlogs= new ArrayList<>();
  }

  public void addBlog() {
    listOfBlogs.add(new BlogPost("Me", "Good book", "somethingsomething",
        "now"));
    listOfBlogs.add(new BlogPost("John Doe",
        "Lorem Ipsum",
        "Lorem ipsum dolor sit amet.",
        "2000.05.04."));
  }
  public void deleteBlog(int index) {
      listOfBlogs.remove(index);
  }

  public void updateBlog(int index, BlogPost blog) {
    listOfBlogs.set(index, blog);
  }

  public static void main(String[] args) {
    Blog test = new Blog();
    test.addBlog();
    test.deleteBlog(1);
  }

}