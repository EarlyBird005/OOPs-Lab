/*10.	If lengths of three sides of a triangle are input through the keyboard, write a program to print the area of the triangle. */
import java.util.*;

public class Pra1_10 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        float a, b, c, s, area;
        System.out.println("Enter three parameters of the triangle: ");
        a = se.nextFloat();
        b = se.nextFloat();
        c = se.nextFloat();

        s = (a + b + c) / 2;
        float tempArea = s * (s - a) * (s - b) * (s - c);
        area = (float) Math.pow(tempArea, 0.5);

        System.out.println("Area of triange is: " + area);
        se.close();
    }
}