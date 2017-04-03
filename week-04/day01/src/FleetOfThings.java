/**
 * Created by hegyi on 2017-04-03.
 */
public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    fleet.add(new Thing("Get milk"));
    fleet.add(new Thing("Remove the obstacles"));

    Thing standUp = new Thing("Stand Up");
    Thing eatLunch = new Thing("Eat lunch");

    standUp.complete();
    eatLunch.complete();

    fleet.add(standUp);
    fleet.add(eatLunch);


    System.out.println(fleet);
  }
}