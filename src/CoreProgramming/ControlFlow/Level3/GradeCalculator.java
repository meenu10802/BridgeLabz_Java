/*
 * This program calculates average percentage from three subject marks
 * and assigns a grade along with appropriate remarks.
 * It demonstrates multi-level conditional grading system used in many educational contexts.
 */
package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);

        // Read marks of three subjects
        int p = sc.nextInt();
        int c = sc.nextInt();
        int m = sc.nextInt();

        // Calculate average percentage
        double percentage = (p + c + m) / 3.0;

        System.out.println("Average:" + percentage);

        // Assign grade and remarks based on percentage
        if (percentage >= 80) {
            System.out.println("Grade:A");
            System.out.println("Remarks:Above agency-normalized standards");
        } else if (percentage >= 70) {
            System.out.println("Grade:B");
            System.out.println("Remarks:At agency-normalized standards");
        } else if (percentage >= 60) {
            System.out.println("Grade:C");
            System.out.println("Remarks:Below but approaching agency-normalized standards");
        } else if (percentage >= 50) {
            System.out.println("Grade:D");
            System.out.println("Remarks:well below agency-normalized standards");
        } else if (percentage >= 40) {
            System.out.println("Grade:E");
            System.out.println("Remarks:too below agency-normalized standards");
        } else {
            System.out.println("Grade:R");
            System.out.println("Remarks:Remedial standards");
        }

        sc.close();
    }
}