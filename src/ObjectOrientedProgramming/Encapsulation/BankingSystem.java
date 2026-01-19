package ObjectOrientedProgramming.Encapsulation;

/*
 * Loanable interface
 * ------------------
 * Defines contract for loan-related operations.
 */
interface Loanable {
    // Method to apply for a loan
    void applyForLoan();
    // Method to calculate loan eligibility
    double calculateLoanEligibility();
}

/*
 * BankAccount abstract class
 * -------------------------
 * Abstract superclass representing a generic bank account.
 * Uses encapsulation to protect account details.
 */
abstract class BankAccount {
    // Private: Account details are protected
    private int accountNumber;
    private String holderName;
    // Protected: Can be accessed by subclasses
    protected double balance;

    // Constructor to initialize bank account
    public BankAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    // Abstract method for interest calculation (implemented by subclasses)
    abstract double calculateInterest();

    // Concrete method to display account details
    public void display() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
        System.out.println("-------------------");
    }
}

/*
 * SavingsAccount class
 * --------------------
 * Represents a Savings Account with 4% interest.
 * Implements Loanable interface for loan functionality.
 */
class SavingsAccount extends BankAccount implements Loanable {
    // Constructor to initialize savings account
    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    // Calculate interest at 4%
    @Override
    double calculateInterest() {
        return balance * 0.04;
    }

    // Apply for loan
    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account");
    }

    // Loan eligibility: 5 times the balance
    @Override
    public double calculateLoanEligibility() {
        return balance * 5;
    }
}

/*
 * CurrentAccount class
 * --------------------
 * Represents a Current Account with 2% interest.
 */
class CurrentAccount extends BankAccount {
    // Constructor to initialize current account
    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    // Calculate interest at 2%
    @Override
    double calculateInterest() {
        return balance * 0.02;
    }
}

/*
 * BankingSystem class
 * ------------------
 * Main class demonstrating polymorphism with different account types.
 */
public class BankingSystem {
    public static void main(String[] args) {
        // Creating array of bank accounts
        BankAccount[] accounts = {
                new SavingsAccount(1, "Kaviya", 50000),
                new CurrentAccount(2, "Anu", 80000)
        };

        // Displaying details using polymorphism
        for (BankAccount acc : accounts) {
            acc.display();
        }
    }
}

