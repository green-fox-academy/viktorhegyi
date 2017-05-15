package com.greenfox.controller;

import com.greenfox.model.Groot;
import com.greenfox.model.ErrorHandling;
import com.greenfox.service.GrootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Viktor on 2017-05-15.
 */
@RestController
public class GuardianController {

  @Autowired
  Groot groot;
  @Autowired
  ErrorHandling errorHandling;

  @GetMapping("/groot")
  public GrootService groot(@RequestParam (value = "message") String message) {
    if (message.length() == 0)
      return errorHandling;
    groot.setReceived(message);
    return groot;
  }

}
