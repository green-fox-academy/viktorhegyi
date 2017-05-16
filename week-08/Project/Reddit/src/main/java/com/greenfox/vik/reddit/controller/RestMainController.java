package com.greenfox.vik.reddit.controller;

import com.greenfox.vik.reddit.model.Post;
import com.greenfox.vik.reddit.model.Posts;
import com.greenfox.vik.reddit.repository.Repository;
import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Viktor on 2017-05-12.
 */
@RestController
public class RestMainController {

  @Autowired
  Repository repository;
  @Autowired
  Posts posts;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public Posts Controller(){
    posts.addPost(repository.findAll());
    return posts;
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post addPost(@RequestBody Post post) {
    post.setTimestamp(new Timestamp(System.currentTimeMillis()));
    return repository.save(post);
  }

  @RequestMapping(value = "/posts/{id}/upvote", method = RequestMethod.PUT)
  public Post upvotePost(@PathVariable (value="id") long id) {
    Post post = repository.findOne(id);
    post.upvoteScore();
    repository.save(post);
    return post;
  }

  @RequestMapping(value = "/posts/{id}/downvote", method = RequestMethod.PUT)
  public Post downvotePost(@PathVariable (value="id") long id) {
    Post post = repository.findOne(id);
    post.downvoteScore();
    repository.save(post);
    return post;
  }

}
