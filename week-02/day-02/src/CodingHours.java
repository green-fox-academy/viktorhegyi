/**
 * Created by hegyi on 2017-03-21.
 */
public class CodingHours {
        public static void main(String[] args) {

          int attandee = 6;
          int semester = 17;
          int numberOfDaysOfTheSemester = 17 * 5;
          int workingDays = 5;
          int weeklyWorkingHours = 52;
          int codePerWeek = attandee * workingDays;


          int attandeeCodingHours = (numberOfDaysOfTheSemester * attandee);

          int percentageOfTheCodingHours = ((codePerWeek / weeklyWorkingHours) * 100);

          System.out.println("The Green Fox student codes " + attandeeCodingHours + " hours in the semester.");
          System.out.println("Percentage of Green Fox student coding hours to work hours: " + percentageOfTheCodingHours + " %");

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

    }
}
