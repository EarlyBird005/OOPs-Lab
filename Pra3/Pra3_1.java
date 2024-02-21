/* Write a Java application which takes several command line arguments, which are supposed to be names of students and prints output as given below: (Suppose we enter 3 names then output should be as follows):
Number of arguments = 3
1: First Student Name is =Tom
2: Second Student Name is =Dick
3: Third Student Name is =Harry
(Hint: An array may be used for converting from numeric values from 1 to 20 into String.)
 */
import java.util.*;
// java Pra3_1.java

public class Pra3_1 {
    public static void main(String[] args) {
        Date t = new Date();
        System.out.println(t);
        if (args.length < 1) {
            System.out.println("Enter al least 1 command line argument.");
            return;
        }

        int Arguments = args.length;
        String[] numericToString = { "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth",
                "Ninth", "Tenth", "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth", "Sixteenth",
                "Seventeenth", "Eighteenth", "Nineteenth", "Twentieth" };

        System.out.println("Number of arguments = " + Arguments);

        for (int i = 0; i < Arguments; i++) {
            System.out.println((i + 1) + ": " + numericToString[i] + " Student Name is =" + args[i]);
        }
    }
}
