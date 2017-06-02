package com.greenfox.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by Viktor on 2017-06-01.
 */
@Entity
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotBlank(message = "must not be blank")
  private String type;

  @NotNull(message = "add a date")
  @Past(message = "you can add future food..")
  @Temporal(TemporalType.DATE)
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date time;

  @NotBlank(message = "must not be blank")
  @Size(min = 3, message = "more than 3 letters..")
  private String description;

  @NotNull(message = "can not be empty")
  @Min(value = 1, message = "minimum 1")
  private Integer calorie;


  public Meal() {
  }

  public Meal(String type, Date time, String description, int calorie) {
    this.type = type;
    this.time = time;
    this.description = description;
    this.calorie = calorie;
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

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getCalorie() {
    return calorie;
  }

  public void setCalorie(Integer calorie) {
    this.calorie = calorie;
  }
}
