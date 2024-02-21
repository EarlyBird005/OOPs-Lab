/*6.	Write a program that prompts the user to enter three integers and display the integers in decreasing order. */
import java.util.*;

public class Pra1_6 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        int num1, num2, num3;
        System.out.println("Enter three integers:");
        num1 = se.nextInt();
        num2 = se.nextInt();
        num3 = se.nextInt();

        int[] arr = { num1, num2, num3 };
        Arrays.sort(arr);
        int temp = arr[2];
        arr[2] = arr[0];
        arr[0] = temp;

        System.out.print("\nElements in a decreasing order: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        se.close();
    }
}