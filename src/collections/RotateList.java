package collections;

import java.util.ArrayList;
import java.util.List;

/*
 * This class rotates elements of a list
 * by a given number of positions.
 */
public class RotateList {

    // Method to rotate list elements
    public static List<Integer> rotate(List<Integer> list, int positions) {

        // Creating a new list for rotated result
        List<Integer> rotatedList = new ArrayList<>();

        int size = list.size();

        // Adjusting rotation count
        positions = positions % size;

        // Adding elements after rotation point
        for (int i = positions; i < size; i++) {
            rotatedList.add(list.get(i));
        }

        // Adding elements before rotation point
        for (int i = 0; i < positions; i++) {
            rotatedList.add(list.get(i));
        }

        return rotatedList;
    }

    // Main method
    public static void main(String[] args) {

        // Input list
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        // Displaying rotated list
        System.out.println(rotate(numbers, 2));
    }
}

