/* Create a class Account. It has three data member account id, name and balance. Define function to assign value and display value. Define function that search account number given by the user. If account number exists, print detail of that account. Write a program using array of object. Declare at least 5 account and print details. */
import java.util.*;

class Account {
    private int acc_id;
    private String name;
    private float balance;

    void setValue(int id, String name, float balance) {
        this.acc_id = id;
        this.name = name;
        this.balance = balance;
    }

    int getId() {
        return this.acc_id;
    }
    String getName() {
        return this.name;
    }
    float getBalance() {
        return this.balance;
    }

    void print() {
        System.out.println("\nAccount id: " + this.acc_id);
        System.out.println("Name: "  + this.name);
        System.out.println("Balance: "  + this.balance);
    }

    Account searchAccount(Account[] cust, int data) {
        for (int i = 0; i < cust.length; i++) {
            if (cust[i].getId() == data) {
                return cust[i];
            }
        }
        return null;
    }
}

public class Pra3_7 {
    public static void main(String[] args) {
        Date t = new Date();
        System.out.println(t);
        Scanner se = new Scanner(System.in);
        System.out.print("how many details you want to fill: ");
        int size = se.nextInt();
        Account[] cust = new Account[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter detail of " + (i+1) + "'s customer (account id, name, balance): ");
            cust[i] = new Account();
            int id = se.nextInt(); 
            se.nextLine();
            String name = se.nextLine(); 
            float balance = se.nextFloat(); 
            cust[i].setValue(id, name, balance);
        }
        
        System.out.print("Enter account number which to search: ");
        int data = se.nextInt();
        
        Account acc = new Account();
        acc = acc.searchAccount(cust, data);
        if (acc != null) {
            acc.print();
        }else {
            System.out.println("Account " + data + " is not found");
        }
        se.close();
    }
}