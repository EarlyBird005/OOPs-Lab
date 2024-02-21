/* Write a program that generate 6*6 two-dimensional matrix, filled with 0’s and 1’s , display the matrix, check every raw and column have an odd number’s of 1’s. */
import java.util.*;

class Pra2_1 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);

        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = (int) (Math.random() * 10) % 2;
                // arr[i][j] = se.nextInt();
            }
        }

        System.out.println("6*6 Matrix:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0; i < 6; i++) {
            int column = 0;
            for (int j = 0; j < 6; j++) {
                column += arr[i][j];
            }
            if (column % 2 == 0) {
                System.out.format("%d row has even 1's\n", i);
            } else {
                System.out.format("%d row has odd 1's\n", i);
            }
        }

        System.out.println("");
        for (int i = 0; i < 6; i++) {
            int row = 0;
            for (int j = 0; j < 6; j++) {
                row += arr[j][i];
            }
            if (row % 2 == 0) {
                System.out.format("%d column has even 1's\n", i);
            } else {
                System.out.format("%d column has odd 1's\n", i);
            }

        }
        se.close();
    }
}