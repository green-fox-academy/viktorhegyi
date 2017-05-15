package com.greenfox.model;

import com.greenfox.service.GrootService;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-15.
 */
@Component
public class ErrorHandling implements GrootService {

  private String error = "I am Groot!";

  public String getError() {
    return error;
  }

}
