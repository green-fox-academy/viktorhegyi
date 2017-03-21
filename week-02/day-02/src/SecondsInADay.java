/**
 * Created by hegyi on 2017-03-21.
 */
public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsOfTheDay = 24 * 60 * 60;
        int secondsOfNow = currentHours * currentMinutes * currentSeconds;

        int remainingSecondsOfTheDay = secondsOfTheDay - secondsOfNow;

        System.out.println("Remaining seconds from the day: " +  remainingSecondsOfTheDay );


        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables




    }
}
