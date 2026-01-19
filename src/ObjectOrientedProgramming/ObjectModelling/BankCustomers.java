package ObjectOrientedProgramming.ObjectModelling.Level1;

/*
 * CustomerDetails class
 * ---------------------
 * Represents a bank customer associated with a Bank.
 */
class CustomerDetails {

    String name;
    double balance;

    CustomerDetails(String name) {
        this.name = name;
        this.balance = 0;
    }

    // Communication with Bank
    void viewBalance() {
        System.out.println(name + " Balance: " + balance);
    }
}

/*
 * BankDetails class
 * -----------------
 * Represents a Bank that associates with Customer objects.
 */
class BankDetails {

    void openAccount(CustomerDetails customer, double amount) {
        customer.balance += amount;
    }

    public static void main(String[] args) {
        BankDetails bank = new BankDetails();
        CustomerDetails cust = new CustomerDetails("Ravi");

        bank.openAccount(cust, 5000);
        cust.viewBalance();
    }
}
