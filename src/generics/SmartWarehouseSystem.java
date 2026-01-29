package generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Abstract base class representing any item that can be stored in the warehouse.
 * All specific item types (Electronics, Groceries, Furniture) must extend this class.
 * This ensures common behavior and enables bounded generics.
 */
abstract class WarehouseItem {

    protected String name;
    protected double price;

    // Constructor to initialize common item properties
    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Abstract method that forces subclasses to provide item details
    public abstract String getItemDetails();
}

/*
 * Represents electronic items in the warehouse.
 * Extends WarehouseItem to inherit common properties.
 */
class Electronics extends WarehouseItem {

    private int warrantyYears;

    // Constructor for Electronics items
    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    // Returns formatted details of the electronic item
    @Override
    public String getItemDetails() {
        return "Electronics [Name=" + name + ", Price=" + price +
                ", Warranty=" + warrantyYears + " years]";
    }
}

/*
 * Represents grocery items in the warehouse.
 * Extends WarehouseItem for type safety.
 */
class Groceries extends WarehouseItem {

    private String expiryDate;

    // Constructor for Grocery items
    public Groceries(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    // Returns formatted details of the grocery item
    @Override
    public String getItemDetails() {
        return "Groceries [Name=" + name + ", Price=" + price +
                ", Expiry Date=" + expiryDate + "]";
    }
}

/*
 * Represents furniture items in the warehouse.
 * Extends WarehouseItem to follow a common hierarchy.
 */
class Furniture extends WarehouseItem {

    private String material;

    // Constructor for Furniture items
    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    // Returns formatted details of the furniture item
    @Override
    public String getItemDetails() {
        return "Furniture [Name=" + name + ", Price=" + price +
                ", Material=" + material + "]";
    }
}

/*
 * Generic Storage class that can store only WarehouseItem objects or its subclasses.
 * Uses bounded type parameter to ensure compile-time type safety.
 */
class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    // Adds an item to storage (write operation)
    public void addItem(T item) {
        items.add(item);
    }
    // Returns all stored items
    public List<T> getItems() {
        return items;
    }
}

/*
 * Utility class for warehouse-related operations.
 * Demonstrates wildcard usage following best practices.
 */
class WarehouseUtils {

    // Displays items using upper bounded wildcard (read-only access)
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getItemDetails());
        }
    }

    // Adds a default electronics item using lower bounded wildcard (write operation)
    public static void addDefaultElectronics(List<? super Electronics> items) {
        items.add(new Electronics("Default Laptop", 55000, 2));
    }
}

/*
 * Main class to demonstrate the Smart Warehouse Management System.
 * Shows usage of generics, bounded types, and wildcards.
 */
public class SmartWarehouseSystem {

    // Main method to run the application
    public static void main(String[] args) {

        // Creating storage for electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 70000, 3));
        electronicsStorage.addItem(new Electronics("Smartphone", 30000, 1));

        // Creating storage for groceries
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Milk", 50, "10-02-2026"));
        groceryStorage.addItem(new Groceries("Rice", 1200, "01-12-2026"));

        // Creating storage for furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 2500, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 8000, "Metal"));

        // Displaying all items using wildcard method
        System.out.println("---- Electronics ----");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\n---- Groceries ----");
        WarehouseUtils.displayItems(groceryStorage.getItems());

        System.out.println("\n---- Furniture ----");
        WarehouseUtils.displayItems(furnitureStorage.getItems());

        // Demonstrating lower bounded wildcard usage
        WarehouseUtils.addDefaultElectronics(electronicsStorage.getItems());

        System.out.println("\n---- Electronics After Adding Default Item ----");
        WarehouseUtils.displayItems(electronicsStorage.getItems());
    }
}
