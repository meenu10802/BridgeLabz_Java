package ObjectOrientedProgramming.Constructors.Level1;

/*
 * BankAccountDetails class
 * ------------------------
 * Demonstrates encapsulation using access modifiers.
 */
public class BankAccountDetails {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double amount) {
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }
}

// Subclass
class SavingsAccountDetails extends BankAccountDetails {

    void displayAccount() {
        System.out.println(accountNumber + " - " + accountHolder);
    }
}
