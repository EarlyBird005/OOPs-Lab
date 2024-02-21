/* Write a program that finds area of any shape by overloading area () method for Square, Rectangle, Triangle and Square. */
import java.util.*;

public class Pra4_3 {
    static float area(float side) {
        return side * side;
    }

    static float area(float width, float length) {
        return width * length;
    }

    static float area(float a, float b, float c) {
        float s = (a + b + c) / 2;
        float tempArea = s * (s - a) * (s - b) * (s - c);
        return (float) Math.pow(tempArea, 0.5);
    }

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        /*
         * add usage of function
         */
        se.close();
    }
}