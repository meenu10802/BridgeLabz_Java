package ObjectOrientedProgramming.Inheritance;

/*
 * PersonnelBase class
 * -------------------
 * Abstract superclass representing a person in a school.
 * Contains common attributes shared by all school roles.
 */
class PersonnelBase {
    String name;  // Name of the person
    int age;  // Age of the person

    // Constructor to initialize person
    PersonnelBase(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display role (can be overridden)
    void displayRole() {
        System.out.println("Person in School");
    }
}

/*
 * TeacherRole class
 * -----------------
 * Subclass representing a Teacher.
 * Extends PersonBase with subject specialization.
 */
class TeacherRole extends PersonnelBase {
    String subject;  // Subject taught by the teacher

    // Constructor to initialize teacher
    TeacherRole(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overridden method to display teacher information
    @Override
    void displayRole() {
        System.out.println("Teacher | Subject: " + subject);
    }
}

/*
 * StudentRole class
 * -----------------
 * Subclass representing a Student.
 * Extends PersonBase with grade information.
 */
class StudentRole extends PersonnelBase {
    String grade;  // Grade/class of the student

    // Constructor to initialize student
    StudentRole(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Overridden method to display student information
    @Override
    void displayRole() {
        System.out.println("Student | Grade: " + grade);
    }
}

/*
 * StaffRole class
 * ---------------
 * Subclass representing a Staff member.
 * Extends PersonBase with department information.
 */
class StaffRole extends PersonnelBase {
    String department;  // Department of the staff member

    // Constructor to initialize staff member
    StaffRole(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Overridden method to display staff information
    @Override
    void displayRole() {
        System.out.println("Staff | Department: " + department);
    }
}

/*
 * SchoolHierarchyDemo
 * -------------------
 * Demonstrates hierarchical inheritance and polymorphism.
 */
class SchoolHierarchyDemo {

    public static void main(String[] args) {
        // Polymorphism using PersonnelBase reference
        PersonnelBase[] people = {
                new TeacherRole("Mr. Rao", 45, "Maths"),
                new StudentRole("Anita", 16, "10th"),
                new StaffRole("Ramesh", 40, "Administration")
        };

        // Loop calling overridden methods dynamically
        for (PersonnelBase p : people) {
            p.displayRole();
        }
    }
}
