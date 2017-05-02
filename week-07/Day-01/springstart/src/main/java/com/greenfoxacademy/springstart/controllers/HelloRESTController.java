package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Viktor on 2017-05-02.
 */

@RestController
public class HelloRESTController {

  @RequestMapping(value="/greeting")
  public Greeting greeting() {
    Greeting newGreeting = new Greeting(1,"Hello");
    return newGreeting;
  }

}
