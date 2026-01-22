package datastructure.stackandqueue.hashmapsandhashfunctions;

import java.util.*;

/*
Check for a Pair with Given Sum in an Array
Problem: Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.
Hint: Store visited numbers in a hash map and check if target - current_number exists in the map.
*/

class PairWithGivenSum {

    // Method to check if a pair exists
    static boolean hasPair(int[] arr, int target) {

        // HashSet to store elements already visited
        // HashSet gives O(1) lookup time
        HashSet<Integer> set = new HashSet<>();

        // Traverse through array
        for (int num : arr) {

            // Calculate the value needed to reach target
            int required = target - num;

            // Check if required value already exists
            if (set.contains(required)) {

                // Pair found
                return true;
            }

            // Add current element to set
            set.add(num);
        }

        // No pair found
        return false;
    }

    public static void main(String[] args) {

        // Scanner object for input
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

        // Print result
        System.out.println(hasPair(arr, target));
    }
}
