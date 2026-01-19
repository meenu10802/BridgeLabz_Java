package ObjectOrientedProgramming.Encapsulation;

/*
 * Discountable interface
 * ----------------------
 * Defines contract for discount functionality.
 */
interface Discountable {
    // Method to apply discount
    double applyDiscount();
    // Method to get discount details
    String getDiscountDetails();
}

/*
 * FoodItem abstract class
 * -----------------------
 * Abstract superclass representing a food item.
 * Uses encapsulation to protect food item details.
 */
abstract class FoodItem {
    // Private: Item name is protected
    private String itemName;
    // Protected: Can be accessed by subclasses
    protected double price;
    protected int quantity;

    // Constructor to initialize food item
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method for total price calculation
    abstract double calculateTotalPrice();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println("--------------------------------");
    }
}

/*
 * VegItem class
 * -----------
 * Represents a Vegetarian food item with no extra charges.
 */
class VegItem extends FoodItem {
    // Constructor to initialize vegetarian item
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    // Vegetarian items: No extra charge
    @Override
    double calculateTotalPrice() {
        return price * quantity;
    }
}

/*
 * NonVegItem class
 * ----------------
 * Represents a Non-Vegetarian food item with 50 rupees extra charge.
 * Implements Discountable interface.
 */
class NonVegItem extends FoodItem implements Discountable {
    // Constructor to initialize non-vegetarian item
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    // Non-vegetarian items: Include 50 rupees extra charge
    @Override
    double calculateTotalPrice() {
        return (price * quantity) + 50;
    }

    // Apply 30 rupees discount on non-veg items
    public double applyDiscount() {
        return 30;
    }

    // Get discount details
    public String getDiscountDetails() {
        return "₹30 discount on Non-Veg items";
    }
}

/*
 * OnlineFoodDeliverySystem class
 * -------------------------
 * Main class demonstrating polymorphism with different food items.
 */
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Creating array of food items using parent reference (Polymorphism)
        FoodItem[] order = {
                new VegItem("Veg Burger", 100, 2),
                new NonVegItem("Chicken Pizza", 250, 1)
        };

        // Process all food items in the order
        for (FoodItem item : order) {
            item.getItemDetails();
        }
    }
}
