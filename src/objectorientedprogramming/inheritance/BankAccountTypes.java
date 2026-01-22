package ObjectOrientedProgramming.Inheritance;

/*
 * BankAccountBase class
 * ---------------------
 * Superclass representing a generic bank account.
 * Contains common attributes like account number and balance.
 */
class BankAccountBase {
    int accountNumber;  // Account number
    double balance;  // Account balance

    // Constructor to initialize bank account
    BankAccountBase(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    // Method to display account type
    void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

/*
 * SavingsAccount class
 * --------------------
 * Subclass representing a Savings Account with interest rate.
 * Inherits from BankAccountBase.
 */
class SavingsAccount extends BankAccountBase {
    double interestRate;  // Interest rate for savings account

    // Constructor to initialize savings account
    SavingsAccount(int acc, double bal, double rate) {
        super(acc, bal);
        this.interestRate = rate;
    }

    // Overridden method to display savings account type
    @Override
    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

/*
 * CheckingAccount class
 * ---------------------
 * Subclass representing a Checking Account with withdrawal limit.
 * Inherits from BankAccountBase.
 */
class CheckingAccount extends BankAccountBase {
    int withdrawalLimit;  // Maximum withdrawal limit per transaction

    // Constructor to initialize checking account
    CheckingAccount(int acc, double bal, int limit) {
        super(acc, bal);
        this.withdrawalLimit = limit;
    }

    // Overridden method to display checking account type
    @Override
    void displayAccountType() {
        System.out.println("Checking Account");
    }
}
