/**
 * Created by hegyi on 2017-03-21.
 */
public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        int heightInCm = (int) (heightInM * 100);


        System.out.println( (massInKg / heightInCm / heightInCm) * 10000 );

        // Print the Body mass index (BMI) based on these values
    }
}
