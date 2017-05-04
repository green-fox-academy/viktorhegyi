package com.greenfox.tamagoci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Viktor on 2017-05-04.
 */
@Controller
public class MainController {

  @RequestMapping("/")
  public ModelAndView index() {
    ModelAndView m = new ModelAndView();
    m.setViewName("index");
    return m;
  }

}
