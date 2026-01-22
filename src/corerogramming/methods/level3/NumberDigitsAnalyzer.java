/*
 * This program calculates sum and sum of squares of digits, checks if harshad, and digit frequency.
 * It demonstrates digit processing and frequency counting using arrays.
 */
package CoreProgramming.Methods.Level3;

public class NumberDigitsAnalyzer {

    // Counts total digits in number
    public static int countDigits(int num) {
        int c = 0;
        while (num > 0) {
            c++;
            num /= 10;
        }
        return c;
    }

    // Stores digits in array
    public static int[] storeDigits(int num) {
        int c = countDigits(num);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = num % 10;
            num /= 10;
        }
        return d;
    }

    // Calculates sum of all digits
    public static int sumDigits(int[] d) {
        int sum = 0;
        for (int digit : d) {
            sum += digit;
        }
        return sum;
    }

    // Calculates sum of squares of digits
    public static int sumSquares(int[] d) {
        int sum = 0;
        for (int digit : d) {
            sum += digit * digit;
        }
        return sum;
    }

    // Checks if harshad (number divisible by sum of digits)
    public static boolean isHarshad(int num, int[] d) {
        return num % sumDigits(d) == 0;
    }

    // Calculates frequency of each digit 0-9
    public static int[][] frequency(int[] d) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }
        for (int digit : d) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int num = 21;
        int[] d = storeDigits(num);
        System.out.println("Sum:" + sumDigits(d));
        System.out.println("Squares:" + sumSquares(d));
        System.out.println("Harshad:" + isHarshad(num, d));
        int[][] f = frequency(d);
        for (int i = 0; i < f.length; i++) {
            if (f[i][1] > 0) {
                System.out.println(f[i][0] + " -> " + f[i][1]);
            }
        }
    }
}