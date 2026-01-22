package datastructure.stackandqueue.hashmapsandhashfunctions;

import java.util.*;

/*
Two Sum Problem
Problem: Given an array and a target sum, find two indices such that their values add up to the target.
Hint: Use a hash map to store the index of each element as you iterate. Check if target - current_element exists in the map.
*/

class TwoSum {

    // Method to find and print indices
    static void findTwoSum(int[] arr, int target) {

        // HashMap to store element value as key
        // and its index as value
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse through array
        for (int i = 0; i < arr.length; i++) {

            // Calculate required value
            int required = target - arr[i];

            // Check if required value exists
            if (map.containsKey(required)) {

                // Print indices if found
                System.out.println(
                        "Indices: " + map.get(required) + " and " + i
                );
                return;
            }

            // Store current element with index
            map.put(arr[i], i);
        }

        // Print message if no pair found
        System.out.println("No pair found");
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        // Read target sum
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Call method
        findTwoSum(arr, target);
    }
}
