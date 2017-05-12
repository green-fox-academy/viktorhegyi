package com.greenfox.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Viktor on 2017-05-11.
 */
@Entity
@Getter
@Setter
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  Date createdAt = new Date();
  String endpoint;
  String data;

  public Log(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
  }

}
