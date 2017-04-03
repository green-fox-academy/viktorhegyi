/**
 * Created by hegyi on 2017-04-03.
 */
public class Person {

  String name;
  int age;
  String gender;

  public void introduce() {
    System.out.println("Hi, I'm " + name + " a " + age + " years old " + gender);
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public Person(String name, int age, String gender) {
  }

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

}
