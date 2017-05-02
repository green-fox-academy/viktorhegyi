package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Viktor on 2017-05-02.
 */

@RestController
public class HelloRESTController {

  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping(value="/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam("name") String name) {
    Greeting newGreeting = new Greeting(atomicLong.incrementAndGet(),"Hello, " + name);
    return newGreeting;
  }

}
