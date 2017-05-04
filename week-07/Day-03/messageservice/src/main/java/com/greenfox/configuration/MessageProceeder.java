package com.greenfox.configuration;

import com.greenfox.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-04.
 */
@Component
public class MessageProceeder {

  @Autowired
  MessageService messageService;

  public void processMessage(String s, String s1) {
    messageService.show(s,s1);
  }

}
