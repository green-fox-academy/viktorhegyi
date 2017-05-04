package com.greenfox.beans.colors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Viktor on 2017-05-04.
 */
@Configuration
public class ColorConfig {

  @Bean
  public MyColor redColor() {
    return new RedColor();
  }

  @Bean
  public MyColor greenColor() {
    return new GreenColor();
  }
}
