package com.greenfox.controller;

import com.greenfox.model.Meal;
import com.greenfox.model.Status;
import com.greenfox.service.CalorieTableService;
import java.util.HashMap;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Viktor on 2017-06-02.
 */
@RestController
public class RestMainController {

  @Autowired
  CalorieTableService calorieTableService;
  @Autowired
  Status status;

  @GetMapping(value = "/getmeals")
  public Object list() {
    return calorieTableService.listOfMeal();
  }

  @GetMapping("/getstats")
  public Object stats() {
    return calorieTableService.numberOfMealsAndCalories();
  }

  @PostMapping("/meal")
  public Object addMeal(@Valid @RequestBody Meal meal, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      HashMap<String,String> error = new HashMap<>();
      error.put("error", "something missing..");
      return error;
    }
    calorieTableService.addMeal(calorieTableService.addWithoutId(meal));
    status.setStatus("ok");
    return status;
  }

  @PutMapping("/meal")
  public Object editMeal(@Valid @RequestBody Meal meal, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      HashMap<String,String> error = new HashMap<>();
      error.put("error", "something missing..");
      return error;
    }
    calorieTableService.addMeal(meal);
    status.setStatus("ok");
    return status;
  }

  @DeleteMapping("/meal")
  public Object deleteMeal(@RequestBody Meal meal) {
    calorieTableService.delete(meal.getId());
    status.setStatus("ok");
    return status;
  }
}
