package com.greenfox.vik.reddit.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-12.
 */
@Component
@Getter
@Setter
public class Posts {

  private Iterable<Post> posts = new ArrayList<>();

  public Posts(List<Post> posts) {
    this.posts = posts;
  }

  public Posts() {
  }

  public void addPost(Iterable<Post> databaseposts){
    posts = databaseposts ;
  }

}
