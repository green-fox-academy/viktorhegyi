package markerannotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Viktor on 2017-04-26.
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Monitor {

  String aspectratio() default "4:3";
  String classification() default "TFT";

}
