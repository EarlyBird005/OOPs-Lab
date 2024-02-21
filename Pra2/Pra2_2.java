/* Write a generic method that returns the minimum elements and their indices in a two dimensional array. */
import java.util.*;

public class Pra2_2 {
    static int[] minimum(int[][] arr) {
        Date t = new Date();
        System.out.println(t);
        int min = arr[0][0], row = 0, column = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return new int[] { min, row, column };
    }

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[j][i] = (int) (Math.random() * 100) % 25;
                // arr[i][j] = se.nextInt();
            }
        }

        System.out.println("4*4 Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        int[] min = minimum(arr);
        System.out.println(
                "\n" + min[0] + " is minimum element & indices(row, column) are: (" + min[1] + ", " + min[2] + ")");
        se.close();
    }
}