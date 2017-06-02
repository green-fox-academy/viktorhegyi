package com.greenfox.service;

import com.greenfox.model.Meal;
import com.greenfox.repository.CalorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-06-01.
 */
@Component
public class CalorieTableService {

  @Autowired
  CalorieRepository calorieRepository;

  public Iterable<Meal> listOfMeal() {
    return calorieRepository.findAll();
  }

  public int getAllCalories() {
    int calories = 0;
    for (Meal meal : listOfMeal()) {
      calories += meal.getCalorie();
    }
    return calories;
  }

  public void addMeal(Meal meal) {
    calorieRepository.save(meal);
  }

  public void delete(long id) {
    calorieRepository.delete(id);
  }

  public Meal find(long id) {
    return calorieRepository.findOne(id);
  }
}
