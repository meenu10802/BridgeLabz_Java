/*
 * This program checks if number is palindrome or duck by processing digits.
 * It demonstrates array reversal and comparison for palindrome check.
 */
package CoreProgramming.Methods.Level3;

public class PalindromeDuckChecker {

    // Counts digits in number
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

    // Reverses the digit array
    public static int[] reverse(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++) {
            r[i] = d[d.length - 1 - i];
        }
        return r;
    }

    // Compares two digit arrays for equality
    public static boolean compare(int[] d1, int[] d2) {
        if (d1.length != d2.length) return false;
        for (int i = 0; i < d1.length; i++) {
            if (d1[i] != d2[i]) return false;
        }
        return true;
    }

    // Checks if palindrome (digits equal reversed digits)
    public static boolean isPalindrome(int[] d) {
        return compare(d, reverse(d));
    }

    // Checks if duck (has zero in digits)
    public static boolean isDuck(int[] d) {
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 121;
        int[] d = storeDigits(num);
        System.out.println("Palindrome:" + isPalindrome(d));
        System.out.println("Duck:" + isDuck(d));
    }
}