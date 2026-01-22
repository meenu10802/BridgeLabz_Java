package ObjectOrientedProgramming.ClassAndObjects.Level2;

/*
 * PalindromeChecker class
 * -----------------------
 * This class checks whether a given string is a palindrome.
 * It stores the text and verifies if it reads the same backward.
 */
public class PalindromeChecker {

    String text;

    // Method to check palindrome
    boolean isPalindrome() {
        String reverse = "";

        // Loop to reverse the string
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        return text.equals(reverse);
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        pc.text = "madam";
        pc.displayResult();
    }
}
