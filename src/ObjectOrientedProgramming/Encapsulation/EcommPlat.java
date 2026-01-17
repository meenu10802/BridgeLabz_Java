package object_oriented_programming.Encapsulation;

import java.util.*;

/*
 * Problem Statement:
 * Write a Java program to demonstrate encapsulation, abstraction,
 * inheritance, interfaces, polymorphism, and runtime type checking
 * in an e-commerce platform.
 */

/*
 * Interface Name: Taxable
 *
 * Description:
 * This interface defines tax-related behaviors that
 * taxable products must implement.
 */
interface Taxable {

    // Method to calculate tax on a product
    double calculateTax();

    // Method to return tax details as a string
    String getTaxDetails();
}

/*
 * Abstract Class Name: Product
 *
 * Description:
 * This abstract class represents a generic product.
 * It demonstrates encapsulation using private variables,
 * abstraction using abstract methods, and provides
 * common functionality for all products.
 */
abstract class Product {

    // Unique identifier for the product
    private int productId;

    // Name of the product
    private String name;

    // Price of the product
    private double price;

    // Constructor to initialize product details
    Product(int productId, String name, double price) {

        // Assign product ID
        this.productId = productId;

        // Assign product name
        this.name = name;

        // Assign product price
        this.price = price;
    }

    // Getter method to access product price
    public double getPrice() {
        return price;
    }

    // Abstract method to calculate discount (implemented by subclasses)
    abstract double calculateDiscount();
}

/*
 * Class Name: Electronics
 *
 * Description:
 * This class represents electronic products.
 * It extends Product and implements Taxable,
 * demonstrating inheritance and interface implementation.
 */
class Electronics extends Product implements Taxable {

    // Constructor to initialize electronic product details
    Electronics(int id, String name, double price) {

        // Call superclass constructor
        super(id, name, price);
    }

    // Implementation of abstract discount calculation
    double calculateDiscount() {

        // Electronics have 10% discount
        return getPrice() * 0.1;
    }

    // Implementation of tax calculation
    public double calculateTax() {

        // Electronics have 18% GST
        return getPrice() * 0.18;
    }

    // Returns tax information
    public String getTaxDetails() {

        // Tax description
        return "18% GST";
    }
}

/*
 * Class Name: Clothing
 *
 * Description:
 * This class represents clothing products.
 * It extends the Product abstract class and
 * provides its own discount logic.
 */
class Clothing extends Product {

    // Constructor to initialize clothing product details
    Clothing(int id, String name, double price) {

        // Call superclass constructor
        super(id, name, price);
    }

    // Implementation of discount calculation
    double calculateDiscount() {

        // Clothing has 20% discount
        return getPrice() * 0.2;
    }
}

/*
 * Class Name: EcommPlat
 *
 * Description:
 * This class contains the main method and simulates
 * an e-commerce platform. It demonstrates polymorphism,
 * instanceof usage, and dynamic method invocation.
 */
public class EcommPlat {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating a list to store Product objects
        List<Product> products = new ArrayList<>();

        // Adding an Electronics product to the list
        products.add(new Electronics(1, "Laptop", 60000));

        // Adding a Clothing product to the list
        products.add(new Clothing(2, "Jacket", 3000));

        // Iterating through each product in the list
        for (Product p : products) {

            // Check if product is taxable using instanceof
            double tax = (p instanceof Taxable)
                    ? ((Taxable) p).calculateTax()  // Type casting and tax calculation
                    : 0;                             // No tax if not taxable

            // Calculate final price after adding tax and subtracting discount
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();

            // Display final price of the product
            System.out.println(finalPrice);
        }
    }
}
