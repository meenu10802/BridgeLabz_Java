package collectionsandstreams.junit;

/**
 * Advanced JUnit - Problem 2: Testing Password Strength Validator
 *
 * This class validates passwords based on rules: at least 8 characters,
 * at least one uppercase letter, and at least one digit.
 */
public class PasswordValidator {

    private static final int MIN_LENGTH = 8;

    // Returns true if password meets: min 8 chars, 1 uppercase, 1 digit
    public boolean isValid(String password) {
        if (password == null || password.length() < MIN_LENGTH) {
            return false;
        }
        boolean hasUppercase = password.chars().anyMatch(Character::isUpperCase);
        boolean hasDigit = password.chars().anyMatch(Character::isDigit);
        return hasUppercase && hasDigit;
    }
}
