import java.util.Scanner;

public class MileToKmConverter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the distance in km:");
        int distanceInKm = scanner.nextInt();

        int distanceInMiles = (int) (distanceInKm * 0.621);

    System.out.println("Distance in miles: " + distanceInMiles);

    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
  }
}
