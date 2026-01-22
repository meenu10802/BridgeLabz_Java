package ObjectOrientedProgramming.ObjectModelling.Level1;

/*
 * UniversityCourse class
 * ----------------------
 * Represents a course taught by a professor (Aggregation).
 * Course can exist independently.
 */
class UniversityCourse {
    String courseName;  // Name of the course
    ProfessorDetails professor;  // Professor teaching the course

    // Constructor to initialize course
    UniversityCourse(String name) {
        this.courseName = name;
    }

    // Method to assign a professor to the course
    void assignProfessor(ProfessorDetails prof) {
        this.professor = prof;
    }
}

/*
 * ProfessorDetails class
 * ----------------------
 * Represents a professor who can teach courses (Aggregation).
 * Professor can exist independently.
 */
class ProfessorDetails {
    String name;  // Name of the professor

    // Constructor to initialize professor
    ProfessorDetails(String name) {
        this.name = name;
    }
}

/*
 * UniversityStudent class
 * --------------------
 * Represents a student who enrolls in courses (Aggregation).
 * Student can exist independently.
 */
class UniversityStudent {
    String name;  // Name of the student

    // Constructor to initialize student
    UniversityStudent(String name) {
        this.name = name;
    }

    // Method to enroll in a course
    void enrollCourse(UniversityCourse course) {
        System.out.println(name + " enrolled in " + course.courseName);
    }
}
