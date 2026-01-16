/*
 * This program finds youngest and tallest person among three using arrays.
 * It demonstrates methods that return index of min/max values.
 */
package CoreProgramming.Methods.Level2;

import java.util.Scanner;

public class YoungestAndTallestFinder {

    // Method finds index of youngest (smallest age)
    public int findYoungestIndex(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method finds index of tallest (largest height)
    public static int findTallestIndex(int[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        // Scanner is used to read names, ages and heights
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Reading ages
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i]);
            ages[i] = sc.nextInt();
        }

        // Reading heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter height of " + names[i]);
            heights[i] = sc.nextInt();
        }

        // Creating object for non-static method
        YoungestAndTallestFinder finder = new YoungestAndTallestFinder();

        // Finding youngest
        int youngestIndex = finder.findYoungestIndex(ages);
        // Finding tallest
        int tallestIndex = findTallestIndex(heights);

        // Printing youngest details
        System.out.println("Youngest is " + names[youngestIndex] + " of " + ages[youngestIndex] + " age");
        // Printing tallest details
        System.out.println("Tallest is " + names[tallestIndex] + " of " + heights[tallestIndex] + " height");

        sc.close();
    }
}