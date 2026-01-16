/*
 * This program finds and returns both smallest and largest number
 * among three given integers using Math.min/max functions.
 * It shows how to return multiple values using an array.
 */
package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class SmallestAndLargest {

    /**
     * Finds smallest and largest among three numbers
     * @return array where index 0 = smallest, index 1 = largest
     */
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);

        // Printing smallest number first
        System.out.println(result[0]);
        // Printing largest number second
        System.out.println(result[1]);

        sc.close();
    }
}