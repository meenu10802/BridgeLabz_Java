package object_oriented_programming.ObjectModelling;

/*
 * Problem Statement:
 * Write a Java program to demonstrate Object Modelling
 * in an e-commerce system using Customer, Order,
 * and Product classes.
 */

/*
 * Class Name: ECustomer
 *
 * Description:
 * This class represents a Customer in an e-commerce system.
 * A customer can place orders, demonstrating association
 * between Customer and Order.
 */
class ECustomer {

    // Name of the customer
    private String name;

    // Constructor to initialize customer details
    ECustomer(String name) {

        // Assign customer name
        this.name = name;
    }

    // Method to place an order
    Order placeOrder() {

        // Create and return a new Order associated with this customer
        return new Order(this);
    }

    // Method to return customer name
    String getName() {
        return name;
    }
}

/*
 * Class Name: Order
 *
 * Description:
 * This class represents an Order placed by a customer.
 * An order contains multiple products, demonstrating
 * aggregation (Order can exist independently of Product).
 */
class Order {

    // Reference to the customer who placed the order
    private ECustomer customer;

    // List of products included in the order
    private java.util.List<Product> products = new java.util.ArrayList<>();

    // Constructor to initialize order with customer
    Order(ECustomer customer) {

        // Assign customer reference
        this.customer = customer;
    }

    // Method to add a product to the order
    void addProduct(Product product) {

        // Add product to the product list
        products.add(product);
    }

    // Method to display order details
    void showOrder() {

        // Display customer name
        System.out.println("Order by " + customer.getName());

        // Display all product names in the order
        products.forEach(p -> System.out.println(p.getName()));
    }
}

/*
 * Class Name: Product
 *
 * Description:
 * This class represents a Product in the e-commerce system.
 * Products are aggregated into Orders.
 */
class Product {

    // Name of the product
    private String name;

    // Constructor to initialize product details
    Product(String name) {

        // Assign product name
        this.name = name;
    }

    // Method to return product name
    String getName() {
        return name;
    }
}

/*
 * Class Name: Ecommerce
 *
 * Description:
 * This class contains the main method and demonstrates
 * object interactions between Customer, Order, and Product
 * in an e-commerce workflow.
 */
class Ecommerce {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating a customer object
        ECustomer customer = new ECustomer("Naveen Karthik");

        // Customer places an order
        Order order = customer.placeOrder();

        // Adding products to the order
        order.addProduct(new Product("Laptop"));
        order.addProduct(new Product("Mouse"));

        // Display order details
        order.showOrder();
    }
}
