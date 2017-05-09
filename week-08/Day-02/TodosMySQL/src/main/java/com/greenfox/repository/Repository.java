package com.greenfox.repository;

import com.greenfox.model.Todo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Viktor on 2017-05-09.
 */
public interface Repository extends CrudRepository<Todo, Long> {

}
