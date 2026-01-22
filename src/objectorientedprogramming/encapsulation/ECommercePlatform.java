package ObjectOrientedProgramming.Encapsulation;

/*
 * Taxable interface
 * -----------------
 * Defines contract for tax calculation.
 */
interface Taxable {
    // Method to calculate tax
    double calculateTax();
    // Method to get tax details
    String getTaxDetails();
}

/*
 * Product abstract class
 * ----------------------
 * Abstract superclass representing a generic product.
 * Uses encapsulation to protect product details.
 */
abstract class Product {
    // Private: Product details are protected
    private int productId;
    private String name;
    // Protected: Can be accessed by subclasses
    protected double price;

    // Constructor to initialize product
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter for price (Encapsulation)
    public double getPrice() {
        return price;
    }

    // Setter for price (Encapsulation)
    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method for discount calculation
    abstract double calculateDiscount();

    // Method to display final price
    public void displayFinalPrice() {
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        double discount = calculateDiscount();
        double finalPrice = price + tax - discount;

        System.out.println(name + " Final Price: " + finalPrice);
    }
}

/*
 * Electronics class
 * -----------------
 * Represents Electronics product with 10% discount and 18% tax.
 */
class Electronics extends Product implements Taxable {
    // Constructor to initialize electronics
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    // Calculate 10% discount
    @Override
    double calculateDiscount() {
        return price * 0.10;
    }

    // Calculate 18% GST tax
    @Override
    public double calculateTax() {
        return price * 0.18;
    }

    // Get tax details
    @Override
    public String getTaxDetails() {
        return "18% GST";
    }
}

/*
 * Clothing class
 * --------------
 * Represents Clothing product with 20% discount.
 */
class Clothing extends Product {
    // Constructor to initialize clothing
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    // Calculate 20% discount
    @Override
    double calculateDiscount() {
        return price * 0.20;
    }
}

/*
 * Groceries class
 * ---------------
 * Represents Groceries product with 5% discount.
 */
class Groceries extends Product {
    // Constructor to initialize groceries
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    // Calculate 5% discount
    @Override
    double calculateDiscount() {
        return price * 0.05;
    }
}

/*
 * ECommercePlatform class
 * -----------------------
 * Main class demonstrating polymorphism with different product types.
 */
public class ECommercePlatform {
    public static void main(String[] args) {
        // Creating array of products
        Product[] products = {
                new Electronics(1, "Laptop", 60000),
                new Clothing(2, "Dress", 2000),
                new Groceries(3, "Rice", 1000)
        };

        // Displaying final price using polymorphism
        for (Product p : products) {
            p.displayFinalPrice();
        }
    }
}
