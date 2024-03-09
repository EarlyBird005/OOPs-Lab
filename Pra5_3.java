/* Write a java program to implement an interface called Exam with a method Pass (int 
mark) that returns a boolean. Write another interface called Classify with a method 
Division (int average) which returns a String. Write a class called Result which 
implements both Exam and Classify. The Pass method should return true if the mark is 
greater than or equal to 50 else false. The Division method must return "First" when the 
parameter average is 60 or more, "Second" when average is 50 or more but below 60, "No 
division" when average is less than 50. 
 */
import java.util.*;

interface Exam {
	boolean Pass (int key);
}

interface Classify {
	String Division (int average);
}

class Result implements Exam, Classify {
	public boolean Pass (int key) {
		if(key >= 50) return true;
		else return false;
	}

	public String Division (int average) {
		if(average >= 60) return "First";
		else if(average >= 50 && average < 60) return "Second";
		else return "No division";
	}	
}

public class Pra5_3 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        

        se.close();
    }
}