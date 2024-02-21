/* Write a program to add, subtract or multiply two 3*3 integer arrays as per choice of user. */
import java.util.*;

public class Pra2_4 {
    static int[][] addition(int[][] a, int[][] b) {
        int[][] add = new int[a.length][a.length];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                add[i][j] = a[i][j] + b[i][j];
            }
        }
        return add;
    }

    static int[][] subtraction(int[][] a, int[][] b) {
        int[][] sub = new int[a.length][a.length];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }
        return sub;
    }

    static int[][] multiplication(int[][] a, int[][] b) {
        int[][] multi = new int[a.length][a.length];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multi[i][j] = 0;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int row = 0; row < 3; row++) {
                    multi[i][j] += a[i][row] * b[row][j];
                }
            }
        }
        return multi;
    }

    static void display(int[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Date t = new Date();
        System.out.println(t);
        Scanner se = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] add = new int[3][3];
        int[][] sub = new int[3][3];
        int[][] multi = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = (int) (Math.random() * 10) % 10;
                // a[i][j] = se.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = (int) (Math.random() * 10) % 10;
                // b[i][j] = se.nextInt();
            }
        }

        System.out.println("3*3 Matrix a:");
        display(a);

        System.out.println("\n3*3 Matrix b:");
        display(b);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1) addition:");
            System.out.println("2) subtraction:");
            System.out.println("3) multiplication:");
            System.out.println("0) exit:");
            System.out.print("Enter your choice: ");
            choice = se.nextInt();
            switch (choice) {
                case 1:
                    add = addition(a, b);
                    System.out.println("\nAfter addition: ");
                    display(add);
                    break;

                case 2:
                    sub = subtraction(a, b);
                    System.out.println("\nAfter subtraction: ");
                    display(sub);
                    break;

                case 3:
                    multi = multiplication(a, b);
                    System.out.println("\nAfter multiplication: ");
                    display(multi);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\ninvalid choice.");
                    break;
            }
        } while (choice != 0);
        se.close();
    }
}