package com.greenfox.repository;

import com.greenfox.model.Type;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-06-01.
 */
@Component
public interface MealTypeRepository extends CrudRepository<Type, Long> {

  @Override
  List<Type> findAll();
}
