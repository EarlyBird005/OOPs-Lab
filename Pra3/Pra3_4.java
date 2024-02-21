/* Create a class Employee which has two private data members name and salary and it has two public member functions named as getData() and putData() where getData() gets name and salary from the user putData() displays name and salary for any user. */
import java.util.*;

class Employee {
    private String name;
    private float salary;

    public void getData(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    void putData() {
        System.out.println("Name: " + this.name + " , salary: " + this.salary);
    }
}

public class Pra3_4 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        Employee e1 = new Employee();

        System.out.print("Enter name of the employee:");
        String name = se.nextLine();
        System.out.print("Enter salary:");
        float salary = se.nextFloat();
        e1.getData(name, salary);
        e1.putData();
        se.close();
    }
}