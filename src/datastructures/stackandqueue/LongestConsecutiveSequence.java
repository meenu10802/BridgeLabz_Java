package datastructure.stackandqueue.hashmapsandhashfunctions;

import java.util.*;

/*
Longest Consecutive Sequence
Problem: Given an unsorted array, find the length of the longest consecutive elements sequence.
Hint: Use a hash map to store elements and check for consecutive elements efficiently.
*/

class LongestConsecutiveSequence {

    // Method to find longest consecutive sequence length
    static int longestSequence(int[] arr) {

        // HashSet to store unique elements
        // Allows fast lookup
        HashSet<Integer> set = new HashSet<>();

        // Add all elements to the set
        for (int num : arr) {
            set.add(num);
        }

        // Variable to store maximum length found
        int longest = 0;

        // Traverse through array
        for (int num : arr) {

            // Check if this number is the start of a sequence
            // A number is a start if num-1 does not exist
            if (!set.contains(num - 1)) {

                int current = num; // Current number
                int count = 1;     // Length of current sequence

                // Check for next consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                // Update longest sequence length
                longest = Math.max(longest, count);
            }
        }

        // Return result
        return longest;
    }

    public static void main(String[] args) {

        // Scanner for input
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

        // Print longest consecutive sequence length
        System.out.println(
                "Longest Consecutive Length: " + longestSequence(arr)
        );
    }
}
