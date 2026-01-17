package ObjectOrientedProgramming.Inheritance;

/*
 * Problem Statement:
 * Write a Java program to demonstrate inheritance
 * using Person, Teacher, Student, and Staff classes.
 */

/*
 * Class Name: Person
 *
 * Description:
 * This superclass represents a generic person.
 * It stores common attributes such as name and age
 * that are shared by all roles.
 */
class Person {

    // Name of the person
    String name;

    // Age of the person
    int age;

    // Constructor to initialize person details
    Person(String name, int age) {

        // Assign person name
        this.name = name;

        // Assign person age
        this.age = age;
    }
}

/*
 * Class Name: Teacher
 *
 * Description:
 * This class represents a Teacher.
 * It extends the Person class and adds
 * teacher-specific information.
 */
class Teacher extends Person {

    // Subject taught by the teacher
    String subject;

    // Constructor to initialize teacher details
    Teacher(String name, int age, String subject) {

        // Call superclass constructor
        super(name, age);

        // Assign subject
        this.subject = subject;
    }

    // Method to display role
    void displayRole() {

        // Display role as Teacher
        System.out.println("Teacher");
    }
}

/*
 * Class Name: Student
 *
 * Description:
 * This class represents a Student.
 * It extends the Person class and adds
 * student-specific information.
 */
class Student extends Person {

    // Grade of the student
    String grade;

    // Constructor to initialize student details
    Student(String name, int age, String grade) {

        // Call superclass constructor
        super(name, age);

        // Assign grade
        this.grade = grade;
    }

    // Method to display role
    void displayRole() {

        // Display role as Student
        System.out.println("Student");
    }
}

/*
 * Class Name: Staff
 *
 * Description:
 * This class represents a Staff member.
 * It extends the Person class and adds
 * staff-specific information.
 */
class Staff extends Person {

    // Department in which staff works
    String department;

    // Constructor to initialize staff details
    Staff(String name, int age, String department) {

        // Call superclass constructor
        super(name, age);

        // Assign department
        this.department = department;
    }

    // Method to display role
    void displayRole() {

        // Display role as Staff
        System.out.println("Staff");
    }
}
