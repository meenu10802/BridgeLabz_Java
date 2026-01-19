package ObjectOrientedProgramming.ObjectModelling.Level1;

import java.util.ArrayList;

/*
 * ProductDetails class
 * --------------------
 * Represents a product that can exist independently (Aggregation).
 * Product can be part of multiple orders.
 */
class ProductDetails {
    String productName;  // Name of the product

    // Constructor to initialize product
    ProductDetails(String name) {
        this.productName = name;
    }
}

/*
 * OrderDetails class
 * ------------------
 * Represents an order that aggregates multiple products (Aggregation).
 * Products can exist outside the order.
 */
class OrderDetails {
    // Collection of products in the order
    ArrayList<ProductDetails> products = new ArrayList<>();

    // Method to add a product to the order
    void addProduct(ProductDetails p) {
        products.add(p);
    }
}

/*
 * EcommerceCustomer class
 * ---------------------
 * Represents a customer who places orders (Aggregation).
 * Customer can exist independently.
 */
class EcommerceCustomer {
    String name;  // Name of the customer

    // Constructor to initialize customer
    EcommerceCustomer(String name) {
        this.name = name;
    }

    // Method to place an order
    void placeOrder(OrderDetails order) {
        System.out.println(name + " placed an order with " + order.products.size() + " products");
    }
}
