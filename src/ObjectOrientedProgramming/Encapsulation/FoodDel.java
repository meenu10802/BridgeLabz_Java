package object_oriented_programming.Encapsulation;

/*
 * Problem Statement:
 * Write a Java program to demonstrate encapsulation, abstraction,
 * interfaces, inheritance, and polymorphism using a food delivery system.
 */

/*
 * Interface Name: Discountable
 *
 * Description:
 * This interface defines discount-related behaviors
 * that eligible food items must implement.
 */
interface Discountable {

    // Method to apply discount on the item
    double applyDiscount();

    // Method to return discount details
    String getDiscountDetails();
}

/*
 * Abstract Class Name: FoodItem
 *
 * Description:
 * This abstract class represents a generic food item.
 * It demonstrates encapsulation using private/protected variables
 * and abstraction using an abstract method.
 */
abstract class FoodItem {

    // Name of the food item (encapsulated)
    private String itemName;

    // Price of the food item (accessible to subclasses)
    protected double price;

    // Quantity ordered (accessible to subclasses)
    protected int quantity;

    // Constructor to initialize food item details
    FoodItem(String name, double price, int qty) {

        // Assign item name
        itemName = name;

        // Assign price
        this.price = price;

        // Assign quantity
        quantity = qty;
    }

    // Abstract method to calculate total price
    abstract double calculateTotalPrice();

    // Method to display item details
    void getItemDetails() {

        // Print item name
        System.out.println(itemName);
    }
}

/*
 * Class Name: NonVegItem
 *
 * Description:
 * This class represents a non-vegetarian food item.
 * It extends the FoodItem abstract class and implements
 * the Discountable interface.
 */
class NonVegItem extends FoodItem implements Discountable {

    // Constructor to initialize non-veg food item
    NonVegItem(String n, double p, int q) {

        // Call superclass constructor
        super(n, p, q);
    }

    // Implementation of total price calculation
    double calculateTotalPrice() {

        // Total price = (price × quantity) + extra charge
        return price * quantity + 50;
    }

    // Implementation of discount application
    public double applyDiscount() {

        // Flat discount of 100
        return 100;
    }

    // Returns discount description
    public String getDiscountDetails() {

        // Discount information
        return "Flat 100 off";
    }
}

/*
 * Class Name: FoodDel
 *
 * Description:
 * This class contains the main method and demonstrates
 * polymorphism by referring to a NonVegItem object
 * using a FoodItem reference.
 */
public class FoodDel {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating NonVegItem object using FoodItem reference
        FoodItem item = new NonVegItem("Chicken", 200, 2);

        // Calling overridden method to calculate total price
        System.out.println(item.calculateTotalPrice());
    }
}
