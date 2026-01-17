package object_oriented_programming.ObjectModelling;

import java.util.ArrayList;

/*
 * Problem Statement:
 * Write a Java program to demonstrate Object Modelling
 * by representing a Bank system with Bank, Customer,
 * and Accounts classes and their relationships.
 */

/*
 * Class Name: Accounts
 *
 * Description:
 * This class represents a bank account.
 * It maintains account number, balance,
 * and the Bank to which the account belongs.
 */
class Accounts {

    // Unique account number
    private long accNo;

    // Bank object showing association with Bank
    private Bank bank;

    // Current balance of the account
    private double balance;

    // Constructor to initialize account details
    Accounts(long accNo, double balance, Bank bank) {

        // Assign account number
        this.accNo = accNo;

        // Assign initial balance
        this.balance = balance;

        // Assign associated bank
        this.bank = bank;
    }

    // Method to deposit money
    public void deposit(int amount) {

        // Increase account balance
        balance += amount;
    }

    // Method to return account balance
    public double getBalance() {
        return balance;
    }

    // Method to return associated bank
    public Bank getBank() {
        return bank;
    }

    // Method to return account number
    public long getAccountNumber() {
        return accNo;
    }

    // Method to withdraw money from account
    public void withdrawMoney(int withdraw) {

        // Check for sufficient balance
        if (withdraw < balance) {

            // Deduct withdrawal amount
            balance -= withdraw;

            // Display success message
            System.out.println("Withdrawal of " + withdraw + " is successful!!");
        } else {

            // Display insufficient balance message
            System.out.println("Insufficient Balance!!");
        }
    }
}

/*
 * Class Name: Bank
 *
 * Description:
 * This class represents a Bank.
 * It maintains a list of customers and
 * is responsible for opening new accounts.
 */
class Bank {

    // Name of the bank
    private String name;

    // List of customers associated with the bank
    private ArrayList<Customer> customers;

    // Counter to generate unique account numbers
    private int accountCounter = 1000;

    // Constructor to initialize bank details
    public Bank(String name) {

        // Assign bank name
        this.name = name;

        // Initialize customer list
        this.customers = new ArrayList<>();
    }

    // Method to return bank name
    public String getName() {
        return name;
    }

    // Method to add a customer to the bank
    public void addCustomer(Customer customer) {

        // Add customer to list
        customers.add(customer);
    }

    // Method to open a new account for a customer
    public Accounts openAccount(Customer customer, double initialDeposit) {

        // Create new account object
        Accounts newAccount = new Accounts(accountCounter++, initialDeposit, this);

        // Add account to customer
        customer.addAccount(newAccount);

        // Display account opening details
        System.out.println("Account " + newAccount.getAccountNumber() +
                " opened for " + customer.getCustomerName() +
                " at " + name + " with balance " + initialDeposit);

        // Return created account
        return newAccount;
    }
}

/*
 * Class Name: Customer
 *
 * Description:
 * This class represents a Customer.
 * A customer can have multiple bank accounts
 * demonstrating a one-to-many relationship.
 */
class Customer {

    // Name of the account holder
    private String accHolder;

    // List of accounts owned by the customer
    private ArrayList<Accounts> account;

    // Constructor to initialize customer details
    Customer(String accHolder) {

        // Assign customer name
        this.accHolder = accHolder;

        // Initialize account list
        this.account = new ArrayList<>();
    }

    // Method to add an account to customer
    public void addAccount(Accounts acc) {

        // Add account to list
        account.add(acc);
    }

    // Method to return customer name
    public String getCustomerName() {
        return accHolder;
    }

    // Method to display customer details and accounts
    public void displayCustomer() {

        // Display customer name
        System.out.println("Customer name: " + accHolder);

        // Iterate through all accounts
        for (Accounts a : account) {

            // Display account details
            System.out.println("Account " + a.getAccountNumber() +
                    " at " + a.getBank().getName() +
                    " has balance: " + a.getBalance());
        }

        System.out.println();
    }
}

/*
 * Class Name: BankAccounts
 *
 * Description:
 * This class contains the main method and demonstrates
 * object interactions between Bank, Customer, and Accounts.
 */
public class BankAccounts {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating Bank object
        Bank bank = new Bank("State Bank of India");

        // Creating Customer object
        Customer c1 = new Customer("Aayush");

        // Adding customer to bank
        bank.addCustomer(c1);

        // Opening accounts for customer
        bank.openAccount(c1, 10000);
        bank.openAccount(c1, 5000);

        System.out.println();

        // Display customer account details
        c1.displayCustomer();
    }
}
