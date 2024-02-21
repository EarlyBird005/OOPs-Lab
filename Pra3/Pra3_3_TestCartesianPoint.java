/* Define a class called Cartesian Point, which has two instance variables, x and y. Provide the methods get X() and get Y() to return the values of the x and y values respectively, a method called move() which would take two integers as parameters and change the values of x and y respectively, a method called display() which would display the current values of x and y. Now overload the method move() to work with single parameter, which would set both x and y to the same values,provide constructors with two parameters and overload to work with one parameter as well. Now define a class called Test Cartesian Point, with the main method to test the various methods in the Cartesian Point class. */
import java.util.*;

class CartesianPoint {
    private int x, y;

    CartesianPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    CartesianPoint(int z) {
        this.x = this.y = z;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void move(int z) {
        this.x = this.y = z;
    }

    void display() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y + "\n");
    }
}

public class Pra3_3_TestCartesianPoint {
    public static void main(String[] args) {
        Date t = new Date();
        System.out.println(t);
        CartesianPoint p1 = new CartesianPoint(5, 4);

        System.out.println("values of p1:");
        p1.display();

        System.out.println("After moving p1 to (17, 5):");
        p1.move(17, 5);
        p1.display();

        CartesianPoint p2 = new CartesianPoint(20);

        System.out.println("values of p2:");
        p2.display();

        System.out.println("After moving p2 to (6, 6):");
        p2.move(6);
        p2.display();
    }
}