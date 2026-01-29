package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * This class removes duplicate elements from a list
 * while maintaining the original insertion order.
 */
public class RemoveDuplicatesPreserveOrder {

    // Method to remove duplicates
    public static List<Integer> removeDuplicates(List<Integer> list) {

        // Using LinkedHashSet to preserve order
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        // Converting set back to list
        return new ArrayList<>(set);
    }

    // Main method
    public static void main(String[] args) {

        // Input list with duplicates
        List<Integer> numbers = List.of(3, 1, 2, 2, 3, 4);

        // Printing result
        System.out.println(removeDuplicates(numbers));
    }
}

