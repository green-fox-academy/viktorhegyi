package com.greenfox.model;

import com.greenfox.service.GrootService;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-15.
 */
@Component
public class Groot implements GrootService {

  private String translated = "I am Groot!";
  String received;

  public void setReceived(String received) {
    this.received = received;
  }

  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated;
  }


}
