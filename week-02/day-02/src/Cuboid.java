/**
 * Created by hegyi on 2017-03-21.
 */
import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double length = 0;
        double breadth = 0;
        double height = 0;

        double volume = 0;
        double surfaceArea = 0;

        System.out.print("Enter the length of Cuboid : ");
        length = input.nextDouble();

        System.out.print("Enter the breadth of Cuboid : ");
        breadth = input.nextDouble();

        System.out.print("Enter the height of Cuboid : ");
        height = input.nextDouble();

        volume = (length * breadth * height);
        surfaceArea = 2 * (length * breadth + breadth * height + height * length);

        System.out.println("");
        System.out.println("Volume : " + volume);
        System.out.println("Surface Area : " + surfaceArea);



    }

}
