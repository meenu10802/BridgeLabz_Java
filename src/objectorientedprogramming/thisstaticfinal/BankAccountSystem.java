package ObjectOrientedProgramming.ThisStaticFinal;

/*
 * BankAccountSystem class
 * -----------------------
 * This class represents a bank account system.
 * It demonstrates the use of static members, final variables,
 * this keyword, and instanceof operator.
 */
public class BankAccountSystem {

    // Static variable shared across all accounts
    static String bankName = "ABC Bank";

    // Static counter to track total accounts
    static int totalAccounts = 0;

    // Instance variables
    String accountHolderName;

    // Final variable – cannot be modified after assignment
    final int accountNumber;

    // Constructor using this keyword
    BankAccountSystem(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method to display total accounts
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to display account details using instanceof
    void displayDetails(Object obj) {
        if (obj instanceof BankAccountSystem) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccountSystem acc = new BankAccountSystem("Ravi", 101);
        acc.displayDetails(acc);
        getTotalAccounts();
    }
}
