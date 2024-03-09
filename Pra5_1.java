/* Describe abstract class called Shape which has three subclasses say Triangle, Rectangle, 
Circle. Define one method area() in the abstract class and override this area() in these three 
subclasses to calculate for specific object, i.e., area() of Triangle subclass should calculate 
area of triangle etc. Same for Rectangle and Circle. 
 */
import java.util.*;

abstract class Shape {
	abstract double area();	
}

class Triangle extends Shape{
	private double height, base;
	
	Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}

	double area() {
		return 0.5*this.base*this.height;	
	}
}

class Rectangle extends Shape{
	private double width, length;

	Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	double area() {
		return this.width*this.length;
	}
}

class Circle extends Shape{
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}
	
	double area() {
		return Math.PI*this.radius*this.radius; 
	}
}

public class Pra5_1 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        

        se.close();
    }
}