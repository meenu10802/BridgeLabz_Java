package datastructure.stackandqueue.hashmapsandhashfunctions;

import java.util.*;

/*
Find All Subarrays with Zero Sum
Problem: Given an array, find all subarrays whose elements sum up to zero.
Hint: Use a hash map to store the cumulative sum and its frequency. If a sum repeats, a zero-sum subarray exists.
*/

class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] arr) {

        // HashMap to store sum and list of indices
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        // Add sum 0 at index -1 (base case)
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {

            // Add current element to sum
            sum += arr[i];

            // If sum already exists, zero-sum subarray found
            if (map.containsKey(sum)) {

                for (int startIndex : map.get(sum)) {
                    System.out.println("Subarray found from index " + (startIndex + 1) + " to " + i);
                }
            }

            // Add index to the map
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        findZeroSumSubarrays(arr);
    }
}
