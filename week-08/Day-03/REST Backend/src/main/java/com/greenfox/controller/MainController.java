package com.greenfox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Viktor on 2017-05-10.
 */
@Controller
public class MainController {

  @RequestMapping(value = "/")
  public String index() {
    return "index";
  }
}
