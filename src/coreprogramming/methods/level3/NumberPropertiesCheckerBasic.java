/*
 * This program checks if a number is duck or armstrong, and finds largest/second largest, smallest/second smallest digits.
 * It demonstrates digit extraction into array and various property checks using helper methods.
 */
package CoreProgramming.Methods.Level3;

public class NumberPropertiesCheckerBasic {

    // Counts total digits in the number by repeated division
    public static int countDigits(int num) {
        int c = 0;
        while (num > 0) {
            c++;
            num /= 10;
        }
        return c;
    }

    // Stores digits of number in an array from most significant to least
    public static int[] storeDigits(int num) {
        int c = countDigits(num);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = num % 10;
            num /= 10;
        }
        return d;
    }

    // Checks if duck number (has zero in digits)
    public static boolean isDuck(int[] d) {
        for (int digit : d) {
            if (digit == 0) return true;
        }
        return false;
    }

    // Checks if armstrong (sum of digit cubes equals number)
    public static boolean isArmstrong(int num, int[] d) {
        int sum = 0;
        for (int digit : d) {
            sum += digit * digit * digit;
        }
        return sum == num;
    }

    // Finds largest and second largest digits in array
    public static int[] largestSecondLargest(int[] d) {
        int largest = -1, second = -1;
        for (int digit : d) {
            if (digit > largest) {
                second = largest;
                largest = digit;
            } else if (digit > second && digit != largest) {
                second = digit;
            }
        }
        return new int[]{largest, second};
    }

    // Finds smallest and second smallest digits in array
    public static int[] smallestSecondSmallest(int[] d) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int digit : d) {
            if (digit < smallest) {
                second = smallest;
                smallest = digit;
            } else if (digit < second && digit != smallest) {
                second = digit;
            }
        }
        return new int[]{smallest, second};
    }

    public static void main(String[] args) {
        int num = 153;
        int[] d = storeDigits(num);
        System.out.println("Duck:" + isDuck(d));
        System.out.println("Armstrong:" + isArmstrong(num, d));
        int[] l = largestSecondLargest(d);
        System.out.println("Largest:" + l[0] + " Second:" + l[1]);
        int[] s = smallestSecondSmallest(d);
        System.out.println("Smallest:" + s[0] + " Second:" + s[1]);
    }
}