import java.util.*;

public class Pra1_11 {
    public static void main(String[] args) {
        Date t = new Date();
        System.out.println(t);
        // 1-->
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
        System.out.println("\n");
        // 2 -->
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }

        System.out.println("\n");
        // 3 -->
        int x = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print((++x) % 10);
            }
            System.out.println("");
        }

        System.out.println("\n");
        // 4 -->
        for (int i = 0; i < 4; i++) {
            for (int space = 0; space < 3 - i; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print('*');
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            for (int space = 0; space < i + 1; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < 5 - (2 * i); star++) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}