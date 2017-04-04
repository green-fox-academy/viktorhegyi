package Homework;

/**
 * Created by hegyi on 2017-04-03.
 */
public class Mentor {

  String name;
  int age;
  String gender;
  String level;

  public void getGoal() {
    System.out.println("My goal: " + "Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " , a " + age + " year old " +
        gender + " " + level + " mentor.");
  }

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  public Mentor() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.level = "intermediate";
  }
}
