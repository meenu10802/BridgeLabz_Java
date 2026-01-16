package ObjectOrientedProgramming.ClassAndObjects.Level2;

/*
 * CartItem class
 * --------------
 * This class represents an item in a shopping cart.
 * It handles adding, removing items and calculating total cost.
 */
public class CartItem {

    String itemName;
    double price;
    int quantity;

    // Method to add item
    void addItem(int qty) {
        quantity += qty;
    }

    // Method to remove item
    void removeItem(int qty) {
        if (qty <= quantity)
            quantity -= qty;
    }

    // Method to calculate total cost
    double getTotalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem();

        cart.itemName = "Notebook";
        cart.price = 50;
        cart.addItem(5);
        cart.removeItem(2);

        System.out.println("Total Cost: " + cart.getTotalCost());
    }
}
