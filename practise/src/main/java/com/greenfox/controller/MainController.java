package com.greenfox.controller;

import com.greenfox.model.Meal;
import com.greenfox.service.CalorieTableService;
import com.greenfox.service.MealTypeService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Viktor on 2017-06-01.
 */
@Controller
public class MainController {

  @Autowired
  CalorieTableService calorieTableService;
  @Autowired
  MealTypeService mealTypeService;

  @RequestMapping("/")
  public String index(Model model){
    model.addAttribute("calorieList", calorieTableService.listOfMeal());
    model.addAttribute("allTheCalories", calorieTableService.getAllCalories());
    return "index";
  }

  @RequestMapping("/add")
  public String add(Model model, Meal meal) {
    model.addAttribute("typeList", mealTypeService.listOfMealType());
    model.addAttribute("meal", meal);
    return "add";
  }

  @PostMapping("/addMeal")
  public String addMeal(@Valid Meal meal, BindingResult bindingResult, Model model) {
    model.addAttribute("typeList", mealTypeService.listOfMealType());
    if (bindingResult.hasErrors()) {
      return "add";
    }
    calorieTableService.addMeal(meal);
    return "redirect:/";
  }

  @RequestMapping("/{id}/delete")
  public String deleteMeal(@PathVariable long id){
    calorieTableService.delete(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String editMeal(@PathVariable long id, Model model){
    model.addAttribute(calorieTableService.find(id));
    model.addAttribute("typeList", mealTypeService.listOfMealType());
    return "edit";
  }

  @PostMapping("/edit")
  public String edit(@Valid Meal meal, BindingResult bindingResult, Model model) {
    model.addAttribute("typeList", mealTypeService.listOfMealType());
    if (bindingResult.hasErrors()) {
      return "edit";
    }
    calorieTableService.addMeal(meal);
    return "redirect:/";
  }
}
