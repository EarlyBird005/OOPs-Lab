/*4.	Write a program that reads a number in meters, converts it to feet, and displays the result. */
import java.util.*;

public class Pra1_4 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        float meter, feet;
        System.out.print("Enter the number: ");
        meter = se.nextFloat();

        feet = meter * 3.281f;
        System.out.println(meter + " meter = " + feet + " feet");
        se.close();
    }
}