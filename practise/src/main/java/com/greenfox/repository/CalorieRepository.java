package com.greenfox.repository;

import com.greenfox.model.Meal;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Viktor on 2017-06-01.
 */
public interface CalorieRepository extends CrudRepository<Meal, Long> {

}
