package com.greenfox.vik.reddit.repository;

import com.greenfox.vik.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Viktor on 2017-05-12.
 */
public interface Repository extends CrudRepository<Post, Long> {

}
