package com.greenfox.controller;

import com.greenfox.model.Todo;
import com.greenfox.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Viktor on 2017-05-09.
 */
@RequestMapping(value = "/todo")
@Controller
public class TodoController {

  @Autowired
  Repository repository;

  @RequestMapping(value = {"/list", "/"})
  public String list(@RequestParam(value = "isActive",required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos", repository.findByIsDoneFalse());
    } else {
      model.addAttribute("todos", repository.findAll());
    }
    return "/ListTodos";
  }

  @RequestMapping(value = "/add")
  public String  newTodo() {
    return "add";
  }

  @RequestMapping(value = "/addTodo")
  public String  addTodo(String title, Model model) {
    model.addAttribute("todos", repository.save(new Todo(title)));
    return "redirect:/todo/";
  }

  @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
  public ModelAndView delete(@PathVariable long id) {
    repository.delete(id);
    return new ModelAndView("redirect:/todo/");
  }


  @GetMapping("/{id}/edit")
  public String edit2(@PathVariable long id, Model model) {
    model.addAttribute("entry", repository.findOne(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String update(long id, String title, boolean isUrgent, boolean isDone, Model model) {
    repository.save(new Todo(title, isUrgent, isDone));
    return "redirect:/";
  }
}
