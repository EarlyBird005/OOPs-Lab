/* Write a program that prompts the user to enter a string and displays the number of vowels and consonants in the string. */
import java.util.*;

public class Pra2_6 {
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
        System.out.println("Enter a string: ");
        String str = se.nextLine();

        // System.out.println("Length: " + str.length());
        int vowel = 0, consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            } else if (checkVowel(str.toLowerCase().charAt(i))) {
                vowel++;
            } else {
                consonant++;
            }
        }

        System.out.printf("\n%d vowles & %d consonant present in a '%s'", vowel, consonant, str);
        se.close();
    }
}