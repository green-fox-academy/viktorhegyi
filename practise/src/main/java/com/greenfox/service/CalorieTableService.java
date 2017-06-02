package com.greenfox.service;

import com.greenfox.model.Meal;
import com.greenfox.model.Status;
import com.greenfox.repository.CalorieRepository;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

/**
 * Created by Viktor on 2017-06-01.
 */
@Component
public class CalorieTableService {

  @Autowired
  CalorieRepository calorieRepository;

  public List<Meal> listOfMeal() {
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


  public HashMap<String, Integer> numberOfMealsAndCalories() {
    HashMap<String, Integer> returnList = new HashMap<>();
    returnList.put("Number of meals", listOfMeal().size());
    returnList.put("Calories amount", getAllCalories());
    return returnList;
  }

  public Meal addWithoutId(Meal meal){
    Meal mealToSave = new Meal();
    mealToSave.setCalorie(meal.getCalorie());
    mealToSave.setDescription(meal.getDescription());
    mealToSave.setTime(meal.getTime());
    mealToSave.setType(meal.getType());
    return mealToSave;
  }

}
