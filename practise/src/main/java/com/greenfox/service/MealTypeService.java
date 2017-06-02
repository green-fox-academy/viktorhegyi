package com.greenfox.service;

import com.greenfox.model.Type;
import com.greenfox.repository.MealTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-06-01.
 */
@Component
public class MealTypeService {

  @Autowired
  MealTypeRepository mealTypeRepository;

  public List<Type> listOfMealType() {
    return mealTypeRepository.findAll();
  }


}
