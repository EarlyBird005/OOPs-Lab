/*8.	A cashier has currency notes of denominations 1, 2, 5, 10, 50 and 100. If the amount to be withdrawn is input through the keyboard, find the total number of currency notes of each denomination the cashier will have to give to the withdrawer. */
import java.util.*;

public class Pra1_8 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        System.out.print("Enter the amount to be withdrawn: ");
        int amount = se.nextInt();

        int[] denomination = { 100, 50, 10, 5, 2, 1 };
        int notes;

        System.out.println("Number of currency notes for each denomination:");
        for (int i = 0; i < denomination.length; i++) {
            notes = amount / denomination[i];
            amount = amount % denomination[i];
            System.out.println(denomination[i] + " notes: " + notes);
        }
        se.close();
    }
}