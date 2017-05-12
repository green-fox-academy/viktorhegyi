package com.greenfox.vik.reddit.model;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Viktor on 2017-05-12.
 */
@Entity
@Getter
@Setter
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String title;
  String href;
  Timestamp timestamp;
  int score;

  public Post (String title, String href) {
    this.title = title;
    this.href = href;
  }

  public Post() {
  }

  public Post (String title, String href, Timestamp timestamp, int score) {
    this.title = title;
    this.href = href;
    this.timestamp = timestamp;
    this.score = score;
  }

  public void upvoteScore() {
    score++;
  }

  public void downvoteScore() {
    score--;
  }

}
