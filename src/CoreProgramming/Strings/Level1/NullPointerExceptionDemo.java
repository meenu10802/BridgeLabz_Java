/*
 * This program demonstrates generating and handling NullPointerException
 * when calling method on null reference.
 * It shows the importance of null checks in code.
 */
package CoreProgramming.Strings.Level1;

public class NullPointerExceptionDemo {

    // Method attempts to call length on null, generating NullPointerException
    public static void generateNullException() {
        String text = null;
        text.length();
    }

    // Method handles NullPointerException when calling on null
    public static void handleNullException() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            // Handling null reference access
            System.out.println("Null point exception handled");
        }
    }

    public static void main(String[] args) {
        // Calling handling method instead of generating exception
        handleNullException();
        // Uncomment to generate exception: generateNullException();
    }
}