package collectionsandstreams.junit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Advanced JUnit - Problem 4: Testing Date Formatter
 *
 * This class converts date from yyyy-MM-dd format to dd-MM-yyyy format.
 * Throws exception for invalid date inputs.
 */
public class DateFormatter {

    private static final DateTimeFormatter INPUT_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter OUTPUT_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    // Converts yyyy-MM-dd to dd-MM-yyyy; throws exception for invalid dates
    public String formatDate(String inputDate) {
        if (inputDate == null || inputDate.trim().isEmpty()) {
            throw new IllegalArgumentException("Input date cannot be null or empty");
        }
        try {
            LocalDate date = LocalDate.parse(inputDate.trim(), INPUT_FORMAT);
            return date.format(OUTPUT_FORMAT);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected yyyy-MM-dd", e);
        }
    }
}
