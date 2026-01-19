package CoreProgramming.Strings.Level3;

import java.util.Scanner;

/*
 * This program displays a calendar for any given month and year.
 * It calculates first day of month, handles leap years, and prints formatted calendar.
 */
public class CalendarPrinter {

    // Method checks if year is leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Method returns number of days in given month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method calculates first day of month (0=Sunday ... 6=Saturday)
    public static int getFirstDayOfMonth(int day, int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31 * m) / 12) % 7;
    }

    // Method displays calendar for given month and year
    public static void printCalendar(int month, int year) {
        String[] months = {
                "", "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        System.out.println("   " + months[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int firstDay = getFirstDayOfMonth(1, month, year);
        int days = getDaysInMonth(month, year);

        // Print spaces before first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%2d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner is used to read month and year from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Displaying calendar
        printCalendar(month, year);

        sc.close();
    }
}