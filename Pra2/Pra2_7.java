/* Write a program that prompts the user to enter two strings and displays the largest common prefix of the two strings. */
import java.util.*;

public class Pra2_7 {
    static String largeCommonPrefix(String str1, String str2) {
        String prefix = "";
        // int index = 0;
        for (int i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                prefix += str1.charAt(i);
                // index = i;
            } else {
                break;
            }
        }
        // System.out.printf("\nINDEX: %d\n", index);
        return prefix;
    }

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        System.out.println("Enter first String: ");
        String str1 = se.nextLine();
        System.out.println("Enter second String: ");
        String str2 = se.nextLine();

        String prefix = largeCommonPrefix(str1, str2);
        System.out.println(prefix);
        se.close();
    }
}