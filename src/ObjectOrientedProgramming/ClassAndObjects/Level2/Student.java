package ObjectOrientedProgramming.ClassAndObjects.Level2;

/*
 * Student class
 * -------------
 * This class represents a student.
 * It stores student name, roll number, and marks.
 * It calculates grade based on marks and displays student details.
 */
public class Student {

    String name;
    int rollNumber;
    int marks;

    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 80) return 'A';
        else if (marks >= 60) return 'B';
        else if (marks >= 40) return 'C';
        else return 'F';
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Anita";
        s.rollNumber = 12;
        s.marks = 78;

        s.displayDetails();
    }
}
