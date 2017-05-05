package com.greenfox.tamagoci.controller;

import com.greenfox.tamagoci.models.Fox;
import com.greenfox.tamagoci.models.ModelAndViewFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Viktor on 2017-05-04.
 */
@Controller
public class MainController {

  @Autowired
  Fox fox;
  @Autowired
  ModelAndViewFactory modelAndViewFactory;

  @RequestMapping("/")
  public ModelAndView index() {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.setViewName("index");
    m.addObject("fox", fox);
    return m;
  }

  @RequestMapping("/nutritionStore")
  public ModelAndView nutritionStore() {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.setViewName("nutritionstore");
    return m;
  }
}
