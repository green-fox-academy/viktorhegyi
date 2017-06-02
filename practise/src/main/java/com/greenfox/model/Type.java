package com.greenfox.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Viktor on 2017-06-01.
 */
@Entity
public class Type {

  @Id
  private long id;
  private String type;

  public Type(String type) {
    this.type = type;
  }

  public Type() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


}
