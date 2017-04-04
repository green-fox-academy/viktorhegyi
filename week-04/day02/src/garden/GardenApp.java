package garden;

/**
 * Created by hegyi on 2017-04-04.
 */
public class GardenApp {

  public static void main(String[] args) {

    Garden garden = new Garden();


    Flower yellowFlower = new Flower("yellow");
    Flower blueFlower = new Flower("blue");
    Tree purpleTree = new Tree("purple");
    Tree orangeTree = new Tree("orange");

    garden.addFlowers(yellowFlower);
    garden.addFlowers(blueFlower);
    garden.addTrees(purpleTree);
    garden.addTrees(orangeTree);

    garden.info();
    garden.watering(40);

    garden.info();
    garden.watering(70);

    garden.info();
  }
}
