package ObjectOrientedProgramming.ThisStaticFinal;

/*
 * ShoppingProductSystem class
 * ---------------------------
 * This class manages shopping cart products.
 * It demonstrates static discount, final product ID,
 * this keyword, and instanceof usage.
 */
public class ShoppingProductSystem {

    static double discount = 10.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    // Constructor using this keyword
    ShoppingProductSystem(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProduct(Object obj) {
        if (obj instanceof ShoppingProductSystem) {
            System.out.println(productName + " | " + price + " | Qty: " + quantity);
        }
    }

    public static void main(String[] args) {
        ShoppingProductSystem p = new ShoppingProductSystem(301, "Mouse", 800, 2);
        p.displayProduct(p);
    }
}
