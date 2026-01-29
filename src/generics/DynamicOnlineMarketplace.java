package generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Category is a common interface for all product categories.
 * It ensures that only valid categories are used in Product.
 */
interface Category {
    String getCategoryName();
}

/*
 * Represents book category in the marketplace.
 */
class BookCategory implements Category {

    // Returns category name
    public String getCategoryName() {
        return "Books";
    }
}

/*
 * Represents clothing category in the marketplace.
 */
class ClothingCategory implements Category {

    // Returns category name
    public String getCategoryName() {
        return "Clothing";
    }
}

/*
 * Represents gadget category in the marketplace.
 */
class GadgetCategory implements Category {

    // Returns category name
    public String getCategoryName() {
        return "Gadgets";
    }
}

/*
 * Generic Product class.
 * Uses bounded type parameter to restrict T to Category types only.
 * Ensures type safety while supporting multiple product categories.
 */
class Product<T extends Category> {

    private String name;
    private double price;
    private T category;

    // Constructor to initialize product details
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Returns product price
    public double getPrice() {
        return price;
    }

    // Updates product price
    public void setPrice(double price) {
        this.price = price;
    }

    // Displays product information
    public void displayProduct() {
        System.out.println(
                "Product: " + name +
                        ", Category: " + category.getCategoryName() +
                        ", Price: ₹" + price
        );
    }
}

/*
 * Generic catalog class to store products of any category safely.
 */
class ProductCatalog {

    private List<Product<?>> products = new ArrayList<>();

    // Adds product to catalog
    public void addProduct(Product<?> product) {
        products.add(product);
    }

    // Displays all products in catalog
    public void displayCatalog() {
        for (Product<?> product : products) {
            product.displayProduct();
        }
    }
}

/*
 * Utility class demonstrating generic methods.
 */
class MarketplaceUtils {

    // Generic method to apply discount to any Product type
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

        // Calculating discounted price
        double discountedPrice =
                product.getPrice() - (product.getPrice() * percentage / 100);

        // Updating product price
        product.setPrice(discountedPrice);
    }
}

/*
 * Main class to demonstrate the Dynamic Online Marketplace system.
 */
public class DynamicOnlineMarketplace {

    // Main method execution starts here
    public static void main(String[] args) {

        // Creating products of different categories
        Product<BookCategory> book =
                new Product<>("Java Programming", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1200, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 30000, new GadgetCategory());

        // Creating catalog and adding products
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        // Displaying catalog before discount
        System.out.println("Before Discount:");
        catalog.displayCatalog();

        // Applying discounts using generic method
        MarketplaceUtils.applyDiscount(book, 10);
        MarketplaceUtils.applyDiscount(shirt, 20);
        MarketplaceUtils.applyDiscount(phone, 5);

        // Displaying catalog after discount
        System.out.println("\nAfter Discount:");
        catalog.displayCatalog();
    }
}

