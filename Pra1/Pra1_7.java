/*7.	Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant. */
import java.util.*;

public class Pra1_7 {
    static boolean checkVowel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        String str;
        do {
            System.out.print("Enter a character: ");
            str = se.next();
        } while (str.length() != 1);

        if (checkVowel((str.toLowerCase()).charAt(0))) {
            System.out.println(str + " is vowel.");
        } else {
            System.out.println(str + " is constant.");
        }
        se.close();
    }
}