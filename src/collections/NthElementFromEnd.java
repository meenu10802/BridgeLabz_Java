package collections;

import java.util.LinkedList;

/*
 * This class finds the Nth element from the end
 * of a LinkedList without calculating its size.
 */
public class NthElementFromEnd {

    // Method to find Nth element from end
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {

        // Initializing two pointers
        int firstPointer = 0;
        int secondPointer = 0;

        // Advancing first pointer by n steps
        while (firstPointer < n) {
            firstPointer++;
        }

        // Moving both pointers together
        while (firstPointer < list.size()) {
            firstPointer++;
            secondPointer++;
        }

        return list.get(secondPointer);
    }

    // Main method
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> letters = new LinkedList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");

        // Printing Nth element from end
        System.out.println(findNthFromEnd(letters, 2));
    }
}

