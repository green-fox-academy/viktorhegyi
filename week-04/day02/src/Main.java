import java.util.ArrayList;

/**
 * Created by hegyi on 2017-04-03.
 */
public class Main {

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Mentor> mentors = new ArrayList<>();


    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    students.add(john);
    Student student = new Student();
    students.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    mentors.add(gandhi);
    Mentor mentor = new Mentor();
    mentors.add(mentor);
    Sponsor sponsor = new Sponsor();
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }
    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for(Person person : people) {
      person.introduce();
      person.getGoal();
    }

    for(Student currentStudent : students) {
      currentStudent.introduce();
      currentStudent.getGoal();
    }

    for(Mentor currentMentor : mentors) {
      currentMentor.introduce();
      currentMentor.getGoal();
    }

    sponsor.introduce();
    sponsor.getGoal();
    elon.introduce();
    elon.getGoal();
  }

}
