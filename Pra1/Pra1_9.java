/*9.	If a five-digit number is input through the keyboard, write a program to print a new number by adding one to each of its digits. For example, if the number that is input is 12391 then the output should be displayed as 23502. */
import java.util.*;

public class Pra1_9 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        int digit5;
        do {
            System.out.print("Enter 5 digit number: ");
            digit5 = se.nextInt();
            if (digit5 > 9999 && digit5 < 100000) {
                break;
            } else {
                System.out.println("Enter valid number");
            }
        } while (true);

        int digit = digit5;
        boolean carry = false;
        String st = "";

        System.out.print("\nAfter adding 1 to each digit: ");
        for (int i = 0; i < 5 || digit < 0; i++) {
            int num = digit % 10;
            digit = digit / 10;
            num++;
            if (num == 10) {
                carry = true;
            } else if (carry == true) {
                num++;
                carry = false;
            }
            st += num % 10;
        }

        if (carry == true) {
            System.out.print(1);
        }
        for (int i = 4; i != -1; i--) {
            System.out.print(st.charAt(i));
        }
        se.close();
    }
}