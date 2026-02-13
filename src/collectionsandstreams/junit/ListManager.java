package collectionsandstreams.junit;

import java.util.List;

/**
 * Basic JUnit Test - Problem 3: List Operations
 *
 * This class provides methods to manage a list of integers: add elements,
 * remove elements, and get the size. Operations modify the list in-place.
 */
public class ListManager {

    // Adds an element to the list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Removes the first occurrence of the element from the list
    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    // Returns the number of elements in the list
    public int getSize(List<Integer> list) {
        return list.size();
    }
}
