package datastructure.sortingalgorithms;

import java.util.Scanner;

public class MergeSortBookPrices {

    /*
    3. Merge Sort - Sort an Array of Book Prices
    Problem Statement:
    A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices in ascending order.
    Hint:
    Divide the array into two halves recursively.
    Sort both halves individually.
    Merge the sorted halves by comparing elements.
    */

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy left subarray
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        // Copy right subarray
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge two subarrays by comparing elements
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left array
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of right array
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);       // Sort left half
            mergeSort(arr, mid + 1, right);  // Sort right half

            merge(arr, left, mid, right);    // Merge both halves
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Loop to take book price input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of book " + (i + 1) + ": ");
            prices[i] = sc.nextInt();
        }

        mergeSort(prices, 0, n - 1);

        System.out.println("Sorted Book Prices (Ascending Order):");

        // Loop to display sorted prices
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }

        sc.close();
    }
}
