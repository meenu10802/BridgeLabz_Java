package collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * This class counts the frequency of each element
 * in a given list of strings using a HashMap.
 */
public class FrequencyOfElements {

    // Method to count frequency of elements
    public static Map<String, Integer> countFrequency(List<String> list) {

        // Creating map to store frequency
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Iterating through the list
        for (String item : list) {

            // Updating count if element exists
            if (frequencyMap.containsKey(item)) {
                frequencyMap.put(item, frequencyMap.get(item) + 1);
            }
            // Adding new element with count 1
            else {
                frequencyMap.put(item, 1);
            }
        }

        return frequencyMap;
    }

    // Main method
    public static void main(String[] args) {

        // Creating input list
        List<String> fruits = List.of("apple", "banana", "apple", "orange");

        // Printing frequency result
        System.out.println(countFrequency(fruits));
    }
}

