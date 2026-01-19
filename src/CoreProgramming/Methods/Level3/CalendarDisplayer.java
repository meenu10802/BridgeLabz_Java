/*
 * This program generates and displays a simple calendar for a given month and year.
 * It calculates the first day of the month and days in month, then prints a calendar layout.
 * It helps understand date calculations, leap year logic and formatted output.
 */
package CoreProgramming.Methods.Level3;

public class CalendarDisplayer {

    // Method checks if year is leap year using standard rules
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Method returns number of days in given month, adjusting for leap February
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method calculates first day of month using Zeller's congruence variant
    public static int getFirstDayOfMonth(int day, int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31 * m) / 12) % 7;
    }

    public static void main(String[] args) {
        // Hardcoded month and year for demonstration
        int month = 7;
        int year = 2005;

        // Printing header for days
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Getting first day (assuming day 1)
        int firstDay = getFirstDayOfMonth(1, month, year);

        // Printing spaces before first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Getting total days in month
        int days = getDaysInMonth(month, year);

        // Printing days with newline every Saturday
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if ((i + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
}