package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * This class demonstrates how to reverse a List manually
 * without using any built-in reverse methods.
 * It works for both ArrayList and LinkedList.
 */
public class ReverseList {

    // Method to reverse a list manually
    public static <T> List<T> reverseList(List<T> list) {

        // Creating a new list to store reversed elements
        List<T> reversedList = new ArrayList<>();

        // Looping from last index to first
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        return reversedList;
    }

    // Main method to test the logic
    public static void main(String[] args) {

        // Creating an ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Creating a LinkedList
        List<Integer> linkedList = new LinkedList<>(arrayList);

        // Displaying reversed lists
        System.out.println("Reversed ArrayList: " + reverseList(arrayList));
        System.out.println("Reversed LinkedList: " + reverseList(linkedList));
    }
}

