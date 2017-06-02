package com.greenfox.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-06-02.
 */
@Component
@JsonInclude(Include.NON_NULL)
public class Status {

  private String status;


  public Status() {
  }

  public Status(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
