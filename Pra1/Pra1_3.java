/*3.	Write a program that solves the following equation and displays the value x and y:
a)      3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer’s rule to solve equation
b)      ax+by=e x=ed-bf/ad-bc	cx+dy=f y=af-ec/ad-bc )
 */
import java.util.*;

public class Pra1_3 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        float a, b, e, c, d, f;
        System.out.print("Enter first equation {a b e}: ");
        a = se.nextFloat();
        b = se.nextFloat();
        e = se.nextFloat();
        System.out.print("Enter second equation {c d f}: ");
        c = se.nextFloat();
        d = se.nextFloat();
        f = se.nextFloat();

        float determinant = a * d - b * c;

        if (determinant != 0) {
            float x = (e * d - b * f) / determinant;
            float y = (a * f - e * c) / determinant;
            System.out.println("\nThe solution is x: " + x + " & y: " + y);
        } else {
            System.out.println("\nEquations have no unique solution.");
        }
        se.close();
    }
}