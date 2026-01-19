package ObjectOrientedProgramming.Constructors.Level1;

/*
 * ProductInventory class
 * ----------------------
 * Demonstrates instance and class variables.
 * Tracks total number of products created.
 */
public class ProductInventory {

    String productName;
    double price;

    static int totalProducts = 0;

    ProductInventory(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println(productName + " - " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        new ProductInventory("Pen", 10);
        new ProductInventory("Book", 50);
        displayTotalProducts();
    }
}
