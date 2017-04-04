package GreenFoxOrganization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hegyi on 2017-04-04.
 */
public class LagopusClass {

  String className;
  List<Student> listOfStudents;
  List<Mentor> listOfMentors;


  public LagopusClass (String className) {
    this.className = className;
    listOfStudents = new ArrayList<>();
    listOfMentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    listOfStudents.add(student);
  }

  public void addMentor(Mentor mentor) {
    listOfMentors.add(mentor);
  }

  public void info() {
    System.out.println("Lagopus " + className + " class has " + listOfStudents.size() +
        " students and " + listOfMentors.size() + " mentors.");
  }

}
