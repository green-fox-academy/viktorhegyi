package markerannotation;

/**
 * Created by Viktor on 2017-04-26.
 */
@markerannotation.Monitor
public class Screen {

  String aspectRatio;
  String classification;
  ScreenSize screenSize;

  public Screen(ScreenSize screenSize) {
    this.screenSize = screenSize;
    this.classification = getClass().getAnnotation(Monitor.class).classification();
    this.aspectRatio = getClass().getAnnotation(Monitor.class).aspectratio();
  }

  @Override
  public String toString() {
    return "Screen size: " + screenSize + ", aspect ratio: " + aspectRatio + ", type: " + classification;
  }
}
