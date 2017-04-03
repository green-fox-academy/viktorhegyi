/**
 * Created by hegyi on 2017-04-03.
 */
public class Animal {
  int hunger;
  int thirst;

  public Animal() {
    hunger = 50;
    thirst = 50;
  }

  public void eat() {
    hunger -= 1;
  }

  public void drink() {
    thirst -= 1;
  }

  public void play() {
    hunger += 1;
    thirst += 1;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "hunger=" + hunger +
        ", thirst=" + thirst +
        '}';
  }

  public static void main(String[] args) {

    Animal lion = new Animal();

    lion.play();
    System.out.println(lion);
    lion.drink();
    System.out.println(lion);
    lion.eat();
    System.out.println(lion);

  }
}
