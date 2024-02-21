/* Define Class named Point which represents 2-D Point, i.e P (x, y).  Define Defaultconstructor to initialize both data member value 5, Parameterized constructor to initialize member according to value supplied by user and Copy Constructor. Define Necessary Function and Write a program to test class Point. */
import java.util.*;

class Point {
    private int x, y;

    Point() {
        this.x = this.y = 5;
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void setX(int x) {
        this.x = x;
    }
    void setY(int y) {
        this.y = y;
    }

    int getX() {
        return this.x;
    }
    int getY() {
        return this.y;
    }

    void print() {
        System.out.println("X: " + x + ", Y: " + y);
    }
}

public class Pra3_6 {
    public static void main(String[] args) {
        Date t = new Date();
        System.out.println(t);
        Scanner se = new Scanner(System.in);
        System.out.println("Using default constructor:");        
        Point p1 = new Point();
        p1.print();
        
        System.out.println("\nUsing parameterized constructor:");        
        System.out.print("Enter value of x & y: ");
        int x = se.nextInt();
        int y = se.nextInt();
        Point p2 = new Point(x, y);
        p2.print();
        
        System.out.println("\nUsing copy constructor:");        
        Point p3 = new Point(p2);
        p3.print();

        se.close();
    }
}