/* Write a program that generate 6*6 two-dimensional matrix, filled with 0’s and 1’s , display the matrix, check every raw and column have an odd number’s of 1’s. */
import java.util.*;

public class Pra2_1 {
    static String postfix(int data) {
        return switch (d % 10) {
            case 1 -> (d == 11) ? "th" : "st";
            case 2 -> (d == 12) ? "th" : "nd";
            case 3 -> (d == 13) ? "th" : "rd";
            default -> "th";
        };
    }

    public static void main(String[] args) {
        System.out.println("Name: Nanecha Dipak Kishorbhai\t Enrollment NO.: 220170116023");
        Date t = new Date();
        System.out.println(t);
        // Scanner se = new Scanner(System.in);
        // System.out.println("Enter 6*6 matrix with 0's & 1's: ");
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = (int) (Math.random() * 10) % 2;
                // arr[i][j] = se.nextInt();
            }
        }

        System.out.println("\n6*6 Matrix:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0; i < 6; i++) {
            int row = 0;
            for (int j = 0; j < 6; j++) {
                row += arr[i][j];
            }
            if (row % 2 == 0) {
                System.out.println(i + postfix(i) + " row has even 1's");
            } else {
                System.out.println(i + postfix(i) + " row has odd 1's");
            }
        }

        System.out.println("");
        for (int i = 0; i < 6; i++) {
            int column = 0;
            for (int j = 0; j < 6; j++) {
                column += arr[j][i];
            }
            if (column % 2 == 0) {
                System.out.println(i + postfix(i) + " column has even 1's");
            } else {
                System.out.println(i + postfix(i) + " column has odd 1's");
            }
        }
        // se.close();
    }
}
