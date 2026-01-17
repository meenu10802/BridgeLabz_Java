package ObjectOrientedProgramming.Inheritance;

/*
 * Problem Statement:
 * Write a Java program to demonstrate inheritance using
 * different types of bank accounts derived from a common
 * BankAccount superclass.
 */

/*
 * Class Name: BankAccount
 *
 * Description:
 * This superclass represents a generic bank account.
 * It stores common attributes such as account number
 * and balance that are shared by all account types.
 */
class BankAccount {

    // Account number of the bank account
    String accountNumber;

    // Current balance of the account
    double balance;

    // Constructor to initialize bank account details
    BankAccount(String accountNumber, double balance) {

        // Assign account number
        this.accountNumber = accountNumber;

        // Assign account balance
        this.balance = balance;
    }
}

/*
 * Class Name: SavingsAccount
 *
 * Description:
 * This class represents a savings account.
 * It extends the BankAccount class and adds
 * savings-specific attributes and behavior.
 */
class SavingsAccount extends BankAccount {

    // Interest rate applicable to savings account
    double interestRate;

    // Constructor to initialize savings account details
    SavingsAccount(String accountNumber, double balance, double interestRate) {

        // Call superclass constructor
        super(accountNumber, balance);

        // Assign interest rate
        this.interestRate = interestRate;
    }

    // Method to display account type
    void displayAccountType() {

        // Display account type
        System.out.println("Savings Account");
    }
}

/*
 * Class Name: CheckingAccount
 *
 * Description:
 * This class represents a checking account.
 * It extends the BankAccount class and adds
 * checking-specific attributes and behavior.
 */
class CheckingAccount extends BankAccount {

    // Withdrawal limit for checking account
    double withdrawalLimit;

    // Constructor to initialize checking account details
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {

        // Call superclass constructor
        super(accountNumber, balance);

        // Assign withdrawal limit
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type
    void displayAccountType() {

        // Display account type
        System.out.println("Checking Account");
    }
}

/*
 * Class Name: FixedDepositAccount
 *
 * Description:
 * This class represents a fixed deposit account.
 * It extends the BankAccount class and adds
 * fixed-deposit-specific attributes and behavior.
 */
class FixedDepositAccount extends BankAccount {

    // Maturity period in months/years
    int maturityPeriod;

    // Constructor to initialize fixed deposit account details
    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {

        // Call superclass constructor
        super(accountNumber, balance);

        // Assign maturity period
        this.maturityPeriod = maturityPeriod;
    }

    // Method to display account type
    void displayAccountType() {

        // Display account type
        System.out.println("Fixed Deposit Account");
    }
}
