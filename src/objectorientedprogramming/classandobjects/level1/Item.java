package ObjectOrientedProgramming.ClassAndObjects.Level1;

/*
 * Item class
 * ----------
 * This class represents an inventory item.
 * It stores item code, name, and price.
 * It can calculate total cost for a given quantity.
 */
public class Item {

    int itemCode;
    String itemName;
    double price;

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Method to display item details
    void displayItemDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Total Cost: " + calculateTotalCost(quantity));
    }

    public static void main(String[] args) {
        Item item = new Item();

        item.itemCode = 201;
        item.itemName = "Keyboard";
        item.price = 1200;

        // Displaying item details with quantity
        item.displayItemDetails(3);
    }
}
