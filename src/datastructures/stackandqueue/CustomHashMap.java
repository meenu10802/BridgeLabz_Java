package datastructure.stackandqueue.hashmapsandhashfunctions;

/*
Implement a Custom Hash Map
Problem: Design and implement a basic hash map class with operations for insertion, deletion, and retrieval.
Hint: Use an array of linked lists to handle collisions using separate chaining.
*/

class CustomHashMap {

    // Node class for linked list
    static class Node {
        int key;       // Key
        int value;     // Value
        Node next;     // Pointer to next node

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    // Size of hash table
    private final int SIZE = 10;

    // Array of linked lists (buckets)
    private Node[] table = new Node[SIZE];

    // Hash function to convert key to index
    private int hash(int key) {
        return key % SIZE;
    }

    // Method to insert or update key-value pair
    void put(int key, int value) {

        int index = hash(key);   // Get index from hash function
        Node head = table[index];

        // Traverse linked list to check if key exists
        while (head != null) {
            if (head.key == key) {
                head.value = value; // Update value
                return;
            }
            head = head.next;
        }

        // Create new node if key not found
        Node newNode = new Node(key, value);

        // Insert node at beginning of list
        newNode.next = table[index];
        table[index] = newNode;
    }

    // Method to retrieve value using key
    int get(int key) {

        int index = hash(key);
        Node head = table[index];

        // Traverse linked list
        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }

        // Return -1 if key not found
        return -1;
    }

    // Method to remove key-value pair
    void remove(int key) {

        int index = hash(key);
        Node head = table[index];
        Node prev = null;

        // Traverse list
        while (head != null) {
            if (head.key == key) {

                // If node to delete is head
                if (prev == null) {
                    table[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {

        CustomHashMap map = new CustomHashMap();

        // Insert values
        map.put(1, 100);
        map.put(2, 200);

        // Retrieve value
        System.out.println(map.get(1));

        // Remove key
        map.remove(1);

        // Try retrieving removed key
        System.out.println(map.get(1));
    }
}
