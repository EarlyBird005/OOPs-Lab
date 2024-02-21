/* Define a class Time with hours and minutes astwo data members, add necessary member functions to initialize and display data of class. Do not use constructors in a class. Define a member function sum () which adds two Time objects. (Use the statements like T3.sum (T1, T2)). */
import java.util.*;

class Time {
    private int hours, minutes;

    void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        }
        else {
            System.err.println("Error in seting hours " + hours);
            System.exit(1);
        }
    }
    
    void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }else {
            System.err.println("Error in seting minutes " + minutes);
            System.exit(1);
        }
    }

    int getHours() {
        return this.hours;
    }

    int getMinutes() {
        return this.minutes;
    }

    void print() {
        System.out.println("Time: " + this.hours + " hours and " + this.minutes + " minutes");
    }

    void sum(Time t1, Time t2) {
        boolean carry = false;
        if (t1.minutes + t2.minutes >= 60) {
            carry = true;
        }
        this.minutes = (t1.minutes + t2.minutes) % 60;

        if (carry) {
            this.hours = (t1.hours + t2.hours + 1) % 24;
        } else {
            this.hours = (t1.hours + t2.hours) % 24;
        }
    }
}

public class Pra3_5 {
    public static void main(String[] args) {
        Date t = new Date();
        System.out.println(t);
        Time t1 = new Time();
        t1.setHours(15);
        t1.setMinutes(48);
        System.out.print("T1 ");
        t1.print();
        
        Time t2 = new Time();
        t2.setHours(13);
        t2.setMinutes(35);
        System.out.print("T2 ");
        t2.print();
        
        Time t3 = new Time();
        t3.sum(t1, t2);
        System.out.println("\nT3 (sum of T1 & T2)");
        t3.print();
    }
}