package datastructure.sortingalgorithms;

import java.util.Scanner;

public class HeapSortJobApplicantsSalary {

    /*
    6. Heap Sort - Sort Job Applicants by Salary
    Problem Statement:
    A company receives job applications with different expected salary demands. Implement Heap Sort to sort these salary demands in ascending order.
    Hint:
    Build a Max Heap from the array.
    Extract the largest element (root) and place it at the end.
    Reheapify the remaining elements and repeat until sorted.
    */

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;       // Assume root is largest
        int left = 2 * i + 1;  // Left child index
        int right = 2 * i + 2; // Right child index

        // Check if left child exists and is greater than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child exists and is greater than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Loop to build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Loop to extract elements one by one from heap
        for (int i = n - 1; i > 0; i--) {

            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of job applicants: ");
        int n = sc.nextInt();

        int[] salaries = new int[n];

        // Loop to take salary demands input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter expected salary of applicant " + (i + 1) + ": ");
            salaries[i] = sc.nextInt();
        }

        heapSort(salaries);

        System.out.println("Sorted Salary Demands (Ascending Order):");

        // Loop to display sorted salaries
        for (int i = 0; i < n; i++) {
            System.out.print(salaries[i] + " ");
        }

        sc.close();
    }
}
