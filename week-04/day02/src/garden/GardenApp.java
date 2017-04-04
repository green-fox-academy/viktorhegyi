package garden;

/**
 * Created by hegyi on 2017-04-04.
 */
public class GardenApp {

  public static void main(String[] args) {

    Garden theGarden = new Garden();

    Flower yellowFlower = new Flower("yellow");
    theGarden.addFlower(yellowFlower);
    Flower blueFlower = new Flower("blue");
    theGarden.addFlower(blueFlower);
    Tree purpleTree = new Tree("purple");
    theGarden.addTree(purpleTree);
    Tree orangeTree = new Tree("orange");
    theGarden.addTree(orangeTree);

    theGarden.watering(40);



  }
}
