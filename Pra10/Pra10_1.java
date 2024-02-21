
/* Write a recursive method that converts a decimal number into a binary number as a string. The method header is: public static String dec2Bin(int value)
Write a test program that prompts the user to enter a decimal number and displays its binary equivalent.
 */
import java.util.*;

public class Pra10_1 {
    public static String dec2Bin(int value) {
        if (value == 0)
            return "";
        String str = "";
        str += dec2Bin(value / 2);
        str += value % 2;
        return str;
    }

    public static String dec2Bin(double value) {
        if (value == 0)
            return "";
        String str = "";
        double binary = value * 2;
        if (binary >= 1) {
            str += 1;
        } else {
            str += 0;
        }
        str += dec2Bin(binary - (int) binary);
        return str;
    }

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        System.out.print("Enter double number: ");
        double d = se.nextDouble();
        String str = dec2Bin((int) d);
        if ((d - (int) d) != 0) {
            str += ".";
            str += dec2Bin(d - (int) d);
        }
        System.out.println(str);
        se.close();
    }
}