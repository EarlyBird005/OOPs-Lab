/* Write a method that returns a new array by eliminating the duplicate values in the array. */
import java.util.*;

public class Pra2_3 {
    static int[] duplicateRemover(int[] arr) {
        int[] a = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j)
                    break;
                else if (j == arr.length - 1)
                    a[k++] = arr[i];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        System.out.print("Enter size fo an array: ");
        int n = se.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " elemnt: ");
            arr[i] = se.nextInt();
        }

        System.out.println("\nReduce array: ");
        int[] a = duplicateRemover(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.println((i + 1) + " elemnt: " + a[i]);
        }
        se.close();
    }
}