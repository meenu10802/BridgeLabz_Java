package object_oriented_programming.Encapsulation;

/*
 * Problem Statement:
 * Write a Java program to demonstrate encapsulation, abstraction,
 * interfaces, inheritance, and polymorphism in a banking system.
 */

/*
 * Interface Name: Loanable
 *
 * Description:
 * This interface defines loan-related behaviors that any
 * loan-eligible account must implement.
 */
interface Loanable {

    // Method to apply for a loan
    void applyForLoan();

    // Method to calculate loan eligibility amount
    double calculateLoanEligibility();
}

/*
 * Abstract Class Name: BankAccount
 *
 * Description:
 * This abstract class represents a generic bank account.
 * It demonstrates encapsulation using private variables,
 * abstraction using abstract methods, and provides
 * common banking operations.
 */
abstract class BankAccount {

    // Private variable to store account number (encapsulation)
    private String accountNumber;

    // Private variable to store account holder name
    private String holderName;

    // Protected balance allows access in subclasses
    protected double balance;

    // Constructor to initialize bank account details
    BankAccount(String acc, String name, double bal) {

        // Assign account number
        accountNumber = acc;

        // Assign account holder name
        holderName = name;

        // Assign initial balance
        balance = bal;
    }

    // Method to deposit money into account
    void deposit(double amount) {

        // Increase balance by deposit amount
        balance += amount;
    }

    // Method to withdraw money from account
    void withdraw(double amount) {

        // Decrease balance by withdrawal amount
        balance -= amount;
    }

    // Abstract method to calculate interest (must be implemented by subclasses)
    abstract double calculateInterest();
}

/*
 * Class Name: SavingsAccount
 *
 * Description:
 * This class represents a savings account and extends
 * the BankAccount abstract class. It provides a concrete
 * implementation for interest calculation.
 */
class SavingsAccount extends BankAccount {

    // Constructor to initialize savings account details
    SavingsAccount(String a, String n, double b) {

        // Call superclass constructor using super keyword
        super(a, n, b);
    }

    // Implementation of abstract method to calculate interest
    double calculateInterest() {

        // Interest calculated at 4% of balance
        return balance * 0.04;
    }
}

/*
 * Class Name: BankSys
 *
 * Description:
 * This class contains the main method and demonstrates
 * runtime polymorphism by referring to a SavingsAccount
 * object using a BankAccount reference.
 */
public class BankSys {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating SavingsAccount object using BankAccount reference
        BankAccount acc = new SavingsAccount("101", "Aayush", 10000);

        // Calling overridden method using polymorphism
        System.out.println(acc.calculateInterest());
    }
}
