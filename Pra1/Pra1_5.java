/*5.	Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing it by the square of your height in meters. Write a program that prompts the user to enter weight in pounds and height in inches and displays the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.
 */
import java.util.*;

public class Pra1_5 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        float weight, height;
        System.out.print("Enter your weight: ");
        weight = se.nextFloat();
        System.out.print("Enter your height: ");
        height = se.nextFloat();

        float weightInKg = 0.45359237f * weight;
        float heightInMeter = 0.0254f * height;
        float BMI = weightInKg / (float) Math.pow(heightInMeter, 2);

        System.out.println("BMI value: " + BMI);
        se.close();
    }
}