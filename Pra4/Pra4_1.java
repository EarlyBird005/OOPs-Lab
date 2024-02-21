/* A set of 5 words (strings) will be taken as command line arguments. Write a program to reverse each word and check whether it is palindrome or not using method. */
import java.util.*;
// java Pra4_1.java

public class Pra4_1 {
    // char[] checkPalindrome(char[] str) {
    //     for (int i = 0; i < str.length / 2; i++) {
    //         int j = str.length - 1 - i;
    //         char temp = str[i];
    //         str[i] = str[j];
    //         str[j] = temp;
    //     }
    //     return  str;
    // }
    
    static boolean checkPalindrome(String str) {
        String revString = "";

        for (int i = str.length() - 1; i > -1; i--) {
            revString += str.charAt(i);
        }

        // System.out.println(revString);
        // System.out.println(revString.equals(str));
        if (revString.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Date t = new Date();
        System.out.println(t);
        // char[] str = args[0].toCharArray();

        if (checkPalindrome(args[0]) == true) {
            System.out.println(args[0] + " is palindrome");
        } else {
            System.out.println(args[0] + " is not a palindrome");
        }
    }
}