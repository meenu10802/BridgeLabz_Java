/*
 * This program demonstrates generating and handling ArrayIndexOutOfBoundsException
 * when accessing invalid array index.
 * It shows reading array from user and proper exception handling.
 */
package CoreProgramming.Strings.Level1;

import java.util.Scanner;

public class ArrayIndexExceptionDemo {

    // Method attempts to access invalid index, generating ArrayIndexOutOfBoundsException
    public static void generateIndexException(String[] names) {
        String value = names[names.length];
    }

    // Method handles ArrayIndexOutOfBoundsException and general RuntimeException
    public static void handleIndexException(String[] names) {
        try {
            String value = names[names.length];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Specific handling for out of bounds array access
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        } catch (RuntimeException e) {
            // Generic handling for other runtime errors
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {
        // Scanner is used to read array size and names from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size:");
        int size = sc.nextInt();

        String[] names = new String[size];

        System.out.println("Enter names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        // Calling handling method instead of generating exception
        handleIndexException(names);
        // Uncomment to generate exception: generateIndexException(names);

        sc.close();
    }
}