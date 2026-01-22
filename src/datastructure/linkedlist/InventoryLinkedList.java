package datastructure.linkedlist;

/*
4. Singly Linked List: Inventory Management System
Problem Statement: Design an inventory management system using a singly linked list where each node stores information about an item such as Item Name, Item ID, Quantity, and Price. Implement the following functionalities:
1. Add an item at the beginning, end, or at a specific position.
2. Remove an item based on Item ID.
3. Update the quantity of an item by Item ID.
4. Search for an item based on Item ID or Item Name.
5. Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
6. Sort the inventory based on Item Name or Price in ascending or descending order.
*/

class ItemNode {
    int itemId, quantity;
    String itemName;
    double price;
    ItemNode next;

    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventoryLinkedList {

    ItemNode head;

    // Add item at end
    void addItem(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Calculate total inventory value
    void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    // Display items
    void displayItems() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println(temp.itemId + " " + temp.itemName + " " +
                    temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addItem(1, "Pen", 10, 5);
        inventory.addItem(2, "Book", 5, 50);

        inventory.displayItems();
        inventory.calculateTotalValue();
    }
}
