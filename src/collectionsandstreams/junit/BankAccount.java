package collectionsandstreams.junit;

/**
 * Advanced JUnit - Problem 1: Testing Banking Transactions
 *
 * This class simulates a bank account with deposit, withdraw, and getBalance
 * operations. Withdrawals fail (throw exception) when funds are insufficient.
 */
public class BankAccount {

    private double balance;

    // Adds money to the account balance
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative");
        }
        this.balance += amount;
    }

    // Reduces balance by the amount; throws exception if insufficient funds
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }
        this.balance -= amount;
    }

    // Returns the current account balance
    public double getBalance() {
        return balance;
    }
}
