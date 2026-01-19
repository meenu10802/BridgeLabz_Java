/*
 * This class checks if current date falls in Spring season
 */
package CoreProgramming.ControlFlow.Level1;

class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if date is in Spring season (March 20 - June 20)
        if ((month == 3 && day >= 20) || month == 4 || month == 5 ||
                (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}