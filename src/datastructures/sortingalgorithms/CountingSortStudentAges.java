package datastructure.sortingalgorithms;

import java.util.Scanner;

public class CountingSortStudentAges {

    /*
    7. Counting Sort - Sort Student Ages
    Problem Statement:
    A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement Counting Sort for this task.
    Hint:
    Create a count array to store the frequency of each age.
    Compute cumulative frequencies to determine positions.
    Place elements in their correct positions in the output array.
    */

    public static void countingSort(int[] arr, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Loop to count frequency of each age
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - minAge]++;
        }

        // Loop to calculate cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // Loop to place elements in correct position (stable sort)
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - minAge] - 1] = arr[i];
            count[arr[i] - minAge]--;
        }

        // Loop to copy sorted output back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        // Loop to take student age input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        countingSort(ages, 10, 18);

        System.out.println("Sorted Student Ages (Ascending Order):");

        // Loop to display sorted ages
        for (int i = 0; i < n; i++) {
            System.out.print(ages[i] + " ");
        }

        sc.close();
    }
}
