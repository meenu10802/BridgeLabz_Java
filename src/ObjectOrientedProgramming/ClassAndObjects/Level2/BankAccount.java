package ObjectOrientedProgramming.ClassAndObjects.Level2;

/*
 * BankAccount class
 * -----------------
 * This class simulates a bank account.
 * It supports deposit, withdrawal, and balance inquiry.
 */
public class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money if sufficient balance exists
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.accountHolder = "Ravi";
        acc.accountNumber = 12345;
        acc.balance = 10000;

        acc.deposit(2000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}
