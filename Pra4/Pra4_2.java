/*Define the class BankAccount to represent an account we open with bank. Define the subclasses SavingAccount and FixedDepositAccount. Implement the operations like openAccount(), deposit(), checkBalance(), withdraw() and calInterest() for these classes. */
import java.util.*;

class BankAccount {
    int accId;
    String name;
    float balance;

    void openAccount(Scanner se) {
        System.out.println("Enter detail of customer(account id, name, balance): ");
        this.accId = se.nextInt();
        se.nextLine();
        this.name = se.nextLine();
        this.balance = se.nextFloat();
    }

    void deposit(float amount) {
        this.balance += amount;
    }

    float checkBalance() {
        return this.balance;
    }

    void withdraw(float amount) {
        this.balance -= amount;
        System.out.println("after withdraw balance is: " + this.balance);
    }

    void calInterest() {
    }
}

class SavingAccount extends BankAccount {
    static float interestRate = 0f;

    SavingAccount(Scanner se) {
        super.openAccount(se);
        if (interestRate == 0f) {
            System.out.print("Enter Interest rate for Saving Account: ");
            interestRate = se.nextFloat();
        }
    }

    void calInterest() {
        float interest = checkBalance() * interestRate;
        super.deposit(interest);
    }

    void withdraw(float amount) {
        float minBalance = 100.0f;

        if (checkBalance() - amount <= minBalance) {
            System.err.println("\nNot sufficient balance.");
            return;
        }

        super.withdraw(amount);
    }
}

class FixedDepositAccount extends BankAccount {
    static float interestRate = 0f;

    FixedDepositAccount(Scanner se) {
        super.openAccount(se);
        if (interestRate == 0f) {
            System.out.print("Enter Interest rate for Saving Account: ");
            interestRate = se.nextFloat();
        }
    }

    void calInterest() {
        float interest = checkBalance() * interestRate;
        super.deposit(interest);
    }

    void withdraw(float amount) {
        if (this.balance < amount) {
            System.err.println("\nNot sufficient balance.");
            return;
        }
        super.withdraw(amount);
    }

}

public class Pra4_2 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        se.close();
    }
}