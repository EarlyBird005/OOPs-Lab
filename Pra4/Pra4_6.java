/* Create a base class Shape. Use this class to store two double type values that could be used to compute area of any shape. Derive two specific classes called Triangle and Rectangle from the base shape. Add to the base a member function getdata() to initialize base class data member and another member function display_area() to compute and display the area of figures. (Use Method Overriding). */
import java.util.*;

class Shape {
    double a, b;

    Shape() {
    }

    void getData(Scanner se) {
        System.out.print("Enter dimension 1: ");
        this.a = se.nextDouble();
        System.out.print("Enter dimension 2: ");
        this.b = se.nextDouble();
    }

    void display_area() {
    }
}

class Triangle extends Shape {

    Triangle() {
    }

    @Override
    void display_area() {
        System.out.println(0.5 * a * b);
    }
}

class Rectangle extends Shape {
    Rectangle() {
    }

    void display_area() {
        System.out.println(a * b);
    }
}

public class Pra4_6 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        Triangle t = new Triangle();
        t.getData(se);
        t.display_area();

        Rectangle r = new Rectangle();
        r.getData(se);
        r.display_area();
        se.close();

    }
}