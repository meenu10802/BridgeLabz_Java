/*
 * This program generates unique 6-digit OTPs for 10 users and checks uniqueness.
 * Demonstrates random generation and uniqueness check methods.
 */
package CoreProgramming.Methods.Level3;

public class OTPGenerator {

    // Method generates random 6-digit OTP (100000-999999)
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method checks if all elements in array are unique (no duplicates)
    public static boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generating 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            // Printing each OTP
            System.out.println(otps[i]);
        }

        // Printing uniqueness status
        System.out.println("All Unique:" + isUnique(otps));
    }
}