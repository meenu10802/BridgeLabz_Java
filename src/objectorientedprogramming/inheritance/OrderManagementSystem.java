package ObjectOrientedProgramming.Inheritance;

/*
 * OrderBase class
 * ---------------
 * Superclass representing a generic order.
 * Contains order ID and date.
 */
class OrderBase {
    int orderId;  // Order ID
    String orderDate;  // Date when order was placed

    // Constructor to initialize order
    OrderBase(int id, String date) {
        this.orderId = id;
        this.orderDate = date;
    }

    // Method to get order status
    String getOrderStatus() {
        return "Order Placed";
    }
}

/*
 * ShippedOrder class
 * ------------------
 * Subclass representing a shipped order.
 * Extends OrderBase with tracking number.
 */
class ShippedOrder extends OrderBase {
    String trackingNumber;  // Tracking number for the shipment

    // Constructor to initialize shipped order
    ShippedOrder(int id, String date, String track) {
        super(id, date);
        this.trackingNumber = track;
    }

    // Overridden method to return shipped status
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

/*
 * DeliveredOrder class
 * --------------------
 * Subclass extending ShippedOrder representing a delivered order.
 * Demonstrates multilevel inheritance.
 */
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;  // Date when order was delivered

    // Constructor to initialize delivered order
    DeliveredOrder(int id, String date, String track, String deliveryDate) {
        super(id, date, track);
        this.deliveryDate = deliveryDate;
    }

    // Overridden method to return delivered status
    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}
