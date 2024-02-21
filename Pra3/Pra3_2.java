/* Design a class named Rectangle to represent a rectangle. The class contains: Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
A no-arg constructor that creates a default rectangle.
A constructor that creates a rectangle with the specified width and height.
A method named getArea() that returns the area of this rectangle.
A method named getPerimeter() that returns the perimeter.
Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.
 */
import java.util.*;

class Rectangle {
    private double width, height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    void print() {
        System.out.println("width: " + this.width);
        System.out.println("height: " + this.height);
        System.out.println("area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }
}

public class Pra3_2 {
    public static void main(String[] args) {
        Date t = new Date();
        System.out.println(t);
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);

        System.out.println("First Rectangle:");
        rec1.print();
        System.out.println("\nSecond Rectangle:");
        rec2.print();
    }
}