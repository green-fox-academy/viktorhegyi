package com.greenfox.vik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Viktor on 2017-05-03.
 */
@Controller
public class EnjoyController {

  @RequestMapping("/exercise4")
  public String viewEnjoy(Model model) {
    String input = "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"";
    model.addAttribute("input", input);
    return "empty";
  }

}
