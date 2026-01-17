package ObjectOrientedProgramming.Inheritance;

/*
 * Problem Statement:
 * Write a Java program to demonstrate multilevel inheritance
 * and method overriding using an order processing system.
 */

/*
 * Class Name: Order
 *
 * Description:
 * This superclass represents a generic order.
 * It stores basic order details and provides
 * a method to return the order status.
 */
class Order {

    // Unique identifier for the order
    String orderId;

    // Date on which the order was placed
    String orderDate;

    // Constructor to initialize order details
    Order(String orderId, String orderDate) {

        // Assign order ID
        this.orderId = orderId;

        // Assign order date
        this.orderDate = orderDate;
    }

    // Method to return current order status
    String getOrderStatus() {

        // Default status when order is placed
        return "Order Placed";
    }
}

/*
 * Class Name: ShippedOrder
 *
 * Description:
 * This class represents an order that has been shipped.
 * It extends the Order class and overrides the
 * order status behavior.
 */
class ShippedOrder extends Order {

    // Tracking number for the shipped order
    String trackingNumber;

    // Constructor to initialize shipped order details
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {

        // Call superclass constructor
        super(orderId, orderDate);

        // Assign tracking number
        this.trackingNumber = trackingNumber;
    }

    // Overriding method to update order status
    @Override
    String getOrderStatus() {

        // Status when order is shipped
        return "Order Shipped";
    }
}

/*
 * Class Name: DeliveredOrder
 *
 * Description:
 * This class represents an order that has been delivered.
 * It extends the ShippedOrder class, demonstrating
 * multilevel inheritance.
 */
class DeliveredOrder extends ShippedOrder {

    // Date on which the order was delivered
    String deliveryDate;

    // Constructor to initialize delivered order details
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {

        // Call superclass constructor
        super(orderId, orderDate, trackingNumber);

        // Assign delivery date
        this.deliveryDate = deliveryDate;
    }

    // Overriding method to update order status
    @Override
    String getOrderStatus() {

        // Status when order is delivered
        return "Order Delivered";
    }
}
