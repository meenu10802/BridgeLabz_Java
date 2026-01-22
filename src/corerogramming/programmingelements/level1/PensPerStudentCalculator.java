/*
 * This class calculates how many pens each student gets and how many are left
 */
package CoreProgramming.ProgrammingElements.Level1;

public class PensPerStudentCalculator {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate pens each student gets and remaining pens
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        // Display the result
        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens);
    }
}