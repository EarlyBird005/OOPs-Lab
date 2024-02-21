/* Some websites impose certain rules for passwords. Write a method that checks whether a string is a valid password. Suppose the password rules are as follows: A password must have at least eight characters. A password consists of only letters and digits. A password must contain at least two digits. Write a program that prompts the user to enter a password and displays Valid Password if the rules are followed or Invalid Password otherwise. */
import java.util.*;

public class Pra2_8 {
    static boolean checkPassword(String str) {
        if (str.length() < 8) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= 48 && ch <= 57)) {
                // if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                continue;
            } else {
                return false;
            }
            // if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= 48 && ch <= 57))) return false;
            // if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))) return false;
        }

        int digit = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 48 && ch <= 57)
                // if (ch >= '0' && ch <= '9') {
                digit++;
        }
        if (digit < 2)
            return false;
        else
            return true;

    }

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        System.out.println("Enter password: ");
        String str = se.nextLine();

        if (checkPassword(str))
            System.out.println("valid password");
        else
            System.out.println("invalid password");
        se.close();
    }
}