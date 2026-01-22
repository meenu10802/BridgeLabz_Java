package datastructure.sortingalgorithms;

import java.util.Scanner;

public class QuickSortProductPrices {

    /*
    4. Quick Sort - Sort Product Prices
    Problem Statement:
    An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.
    Hint:
    Pick a pivot element (first, last, or random).
    Partition the array such that elements smaller than the pivot are on the left and larger ones are on the right.
    Recursively apply Quick Sort on left and right partitions.
    */

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Pivot chosen as last element
        int i = low - 1;

        // Loop to rearrange elements around pivot
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);   // Sort left partition
            quickSort(arr, pi + 1, high);  // Sort right partition
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Loop to take product prices input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter product price " + (i + 1) + ": ");
            prices[i] = sc.nextInt();
        }

        quickSort(prices, 0, n - 1);

        System.out.println("Sorted Product Prices (Ascending Order):");

        // Loop to display sorted prices
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }

        sc.close();
    }
}
