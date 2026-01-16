/*
 * This program calculates how many handshakes happen when N students
 * shake hands with every other student exactly once.
 * Uses combination formula n*(n-1)/2 to avoid double counting.
 */
package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class HandshakeProgram {

    // Method calculates total possible handshakes among students
    public int calculateHandshakes(int students) {
        return students * (students - 1) / 2;
    }

    public static void main(String[] args) {
        // Scanner is used to read number of students from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int students = sc.nextInt();

        // Creating object because method is non-static
        HandshakeProgram obj = new HandshakeProgram();

        // Printing total number of handshakes
        System.out.println(obj.calculateHandshakes(students));

        sc.close();
    }
}