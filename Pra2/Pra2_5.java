/* Write a program to sort an array of 10 elements using selection sort. */
import java.util.*;

public class Pra2_5 {
    static int[] selectionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int min = i - 1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i - 1];
            arr[i - 1] = temp;
        }
        return arr;
    }

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100) % 210;
            // System.out.print("Enter " + (i + 1) + " element: ");
            // arr[i] = se.nextInt();
        }
        display(arr);

        arr = selectionSort(arr);

        System.out.println("\nSorted array:");
        display(arr);
        se.close();
    }
}