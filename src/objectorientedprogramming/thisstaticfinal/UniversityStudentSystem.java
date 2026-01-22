package ObjectOrientedProgramming.ThisStaticFinal;

/*
 * UniversityStudentSystem class
 * -----------------------------
 * This class manages student details.
 * It demonstrates static members, final roll number,
 * this keyword, and instanceof validation.
 */
public class UniversityStudentSystem {

    static String universityName = "ABC University";
    static int totalStudents = 0;

    String name;
    String grade;
    final int rollNumber;

    // Constructor using this keyword
    UniversityStudentSystem(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudent(Object obj) {
        if (obj instanceof UniversityStudentSystem) {
            System.out.println(name + " | " + rollNumber + " | " + grade);
        }
    }

    public static void main(String[] args) {
        UniversityStudentSystem s = new UniversityStudentSystem("Meena", 501, "A");
        s.displayStudent(s);
        displayTotalStudents();
    }
}
