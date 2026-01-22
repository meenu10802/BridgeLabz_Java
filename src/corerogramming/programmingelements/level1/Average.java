/*
 * This class calculates average marks of Same in Physics, Chemistry and Maths
 */
package CoreProgramming.ProgrammingElements.Level1;

public class Average{
    public static void main(String[] args) {
        int math = 94;
        int physics = 95;
        int chemistry = 96;

        // Calculate total and average marks
        int totalMarks = math + physics + chemistry;
        double averageMarks = totalMarks / 3.0;

        // Display the average
        System.out.println("Same's average mark in PCM is " + averageMarks);
    }
}