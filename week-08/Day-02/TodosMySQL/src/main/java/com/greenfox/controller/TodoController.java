package com.greenfox.controller;

import com.greenfox.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Viktor on 2017-05-09.
 */
@RequestMapping(value = "/todo")
@Controller
public class TodoController {

  @Autowired
  Repository repository;

  @RequestMapping(value = {"/list", "/"})
  public String list(Model model) {
    model.addAttribute("todos", repository.findAll());
    return "/ListTodos";
  }

}
