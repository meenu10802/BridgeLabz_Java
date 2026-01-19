/**
 * Class Name: FriendsStats
 * Purpose:  Find minimum age and maximum height among 3 friends
 */
package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class FriendsStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store age and height of 3 friends
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Read age and height for each friend
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }

        // Initialize with first person's data
        int minAge = ages[0];
        int maxHeight = heights[0];

        // Find minimum age and maximum height
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
            }
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
            }
        }

        System.out.println(minAge);
        System.out.println(maxHeight);

        sc.close();
    }
}