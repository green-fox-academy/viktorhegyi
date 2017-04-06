import java.util.ArrayList;

/**
 * Created by hegyi on 2017-04-03.
 */
public class Farm {

  private int slots = 4;
  Animal giraffe = new Animal();
  Animal lion = new Animal();
  Animal bear = new Animal();
  Animal rabbit = new Animal();

  ArrayList<Animal> listOfAnimals = new ArrayList<>();

  public void fillWithAnimals() {

  listOfAnimals.add(giraffe);
  listOfAnimals.add(lion);
  listOfAnimals.add(bear);
  listOfAnimals.add(rabbit);
  }

  public void breed() {
    if (listOfAnimals.size() < slots) {
      listOfAnimals.add(new Animal());
    }
  }

  public void slaughter() {
    int min = 0;
    for (int i = 0; i <listOfAnimals.size() ; i++) {
      if (listOfAnimals.get(i).hunger > listOfAnimals.get(i + 1).hunger) {
        min = i;
      }
    }
    listOfAnimals.remove(min);
  }

}
