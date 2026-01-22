package ObjectOrientedProgramming.ObjectModelling.Level1;

import java.util.ArrayList;

/*
 * CourseDetails class
 * -------------------
 * Represents a Course that contains multiple students.
 * Many-to-many relationship with students.
 */
class CourseDetails {
    String courseName;  // Name of the course
    // Collection of students enrolled in this course
    ArrayList<StudentDetails> students = new ArrayList<>();

    // Constructor to initialize course
    CourseDetails(String courseName) {
        this.courseName = courseName;
    }
}

/*
 * StudentDetails class
 * --------------------
 * Represents a Student who can enroll in multiple courses (Many-to-many).
 * Student can exist independently.
 */
class StudentDetails {
    String name;  // Name of the student
    // Collection of courses enrolled by this student
    ArrayList<CourseDetails> courses = new ArrayList<>();

    // Constructor to initialize student
    StudentDetails(String name) {
        this.name = name;
    }

    // Method to enroll in a course
    void enrollCourse(CourseDetails course) {
        courses.add(course);
        course.students.add(this);
    }
}

/*
 * SchoolDetails class
 * ------------------
 * Represents a School that aggregates students (Aggregation).
 * Students can exist outside the school.
 */
class SchoolDetails {
    // Collection of students in the school
    ArrayList<StudentDetails> students = new ArrayList<>();

    // Method to add a student to the school
    void addStudent(StudentDetails student) {
        students.add(student);
    }

    public static void main(String[] args) {
        // Creating school and students
        SchoolDetails school = new SchoolDetails();
        StudentDetails s1 = new StudentDetails("Anu");

        // Creating courses
        CourseDetails c1 = new CourseDetails("Maths");
        CourseDetails c2 = new CourseDetails("Science");

        // Enrolling student in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        // Adding student to school
        school.addStudent(s1);
    }
}
