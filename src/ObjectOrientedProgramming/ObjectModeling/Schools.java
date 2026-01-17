package object_oriented_programming.ObjectModelling;

import java.util.*;

/*
 * Problem Statement:
 * Write a Java program to demonstrate Object Modelling
 * using School, Student, and Course classes where
 * students can enroll in multiple courses and
 * courses can have multiple students.
 */

/*
 * Class Name: School
 *
 * Description:
 * This class represents a School.
 * A school can have multiple students,
 * demonstrating a one-to-many association.
 */
class School {

    // Name of the school
    private String name;

    // List of students in the school
    private List<Student> students = new ArrayList<>();

    // Constructor to initialize school name
    School(String name) {

        // Assign school name
        this.name = name;
    }

    // Method to add a student to the school
    void addStudent(Student student) {

        // Add student to the list
        students.add(student);
    }
}

/*
 * Class Name: Student
 *
 * Description:
 * This class represents a Student.
 * A student can enroll in multiple courses,
 * demonstrating a many-to-many relationship.
 */
class Student {

    // Name of the student
    private String name;

    // Set of courses enrolled by the student
    private Set<Course> courses = new HashSet<>();

    // Constructor to initialize student name
    Student(String name) {

        // Assign student name
        this.name = name;
    }

    // Method to enroll student in a course
    void enroll(Course course) {

        // Add course to student's course list
        courses.add(course);

        // Add student to course's student list
        course.addStudent(this);
    }

    // Method to display courses enrolled by the student
    void viewCourses() {

        // Display student name
        System.out.println(name + " courses:");

        // Display all enrolled course titles
        courses.forEach(c -> System.out.println(c.getTitle()));
    }

    // Method to return student name
    String getName() {
        return name;
    }
}

/*
 * Class Name: Course
 *
 * Description:
 * This class represents a Course.
 * A course can have multiple students enrolled,
 * demonstrating a many-to-many association.
 */
class Course {

    // Title of the course
    private String title;

    // Set of students enrolled in the course
    private Set<Student> students = new HashSet<>();

    // Constructor to initialize course title
    Course(String title) {

        // Assign course title
        this.title = title;
    }

    // Method to add a student to the course
    void addStudent(Student student) {

        // Add student to the course
        students.add(student);
    }

    // Method to display students enrolled in the course
    void viewStudents() {

        // Display course title
        System.out.println("Students in " + title + ":");

        // Display all student names
        students.forEach(s -> System.out.println(s.getName()));
    }

    // Method to return course title
    String getTitle() {
        return title;
    }
}

/*
 * Class Name: Schools
 *
 * Description:
 * This class contains the main method and demonstrates
 * interaction between School, Student, and Course objects
 * using many-to-many object relationships.
 */
class Schools {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating School object
        School school = new School("Pon Vidyashram");

        // Creating Student objects
        Student a = new Student("Dinesh");
        Student b = new Student("Ritika");

        // Creating Course objects
        Course math = new Course("Math");
        Course science = new Course("Science");

        // Adding students to school
        school.addStudent(a);
        school.addStudent(b);

        // Enrolling students into courses
        a.enroll(math);
        a.enroll(science);
        b.enroll(science);

        // Display courses taken by student Dinesh
        a.viewCourses();

        // Display students enrolled in Science course
        science.viewStudents();
    }
}
