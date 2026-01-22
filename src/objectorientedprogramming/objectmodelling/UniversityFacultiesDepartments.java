package ObjectOrientedProgramming.ObjectModelling.Level1;

import java.util.ArrayList;

/*
 * FacultyDetails class
 * --------------------
 * Represents Faculty that can exist independently (Aggregation).
 * Faculty can be part of multiple universities.
 */
class FacultyDetails {
    String name;  // Name of the faculty member

    // Constructor to initialize faculty
    FacultyDetails(String name) {
        this.name = name;
    }
}

/*
 * UniversityDepartment class
 * -----------------------
 * Represents a Department that exists only inside University (Composition).
 * Department cannot exist without a university.
 */
class UniversityDepartment {
    String deptName;  // Name of the department

    // Constructor to initialize department
    UniversityDepartment(String deptName) {
        this.deptName = deptName;
    }
}

/*
 * UniversityDetails class
 * -----------------------
 * Represents a University that composes Departments and aggregates Faculty.
 * Composition: Departments cannot survive without university.
 * Aggregation: Faculty can exist without university.
 */
class UniversityDetails {
    // Collection of departments (Composition)
    ArrayList<UniversityDepartment> departments = new ArrayList<>();
    // Collection of faculty members (Aggregation)
    ArrayList<FacultyDetails> faculty = new ArrayList<>();

    // Method to add a department to the university
    void addDepartment(String name) {
        departments.add(new UniversityDepartment(name));
    }

    // Method to add a faculty member to the university
    void addFaculty(FacultyDetails f) {
        faculty.add(f);
    }

    public static void main(String[] args) {
        // Creating university and adding department
        UniversityDetails uni = new UniversityDetails();
        uni.addDepartment("CSE");

        // Creating and adding faculty
        FacultyDetails f1 = new FacultyDetails("Dr. Rao");
        uni.addFaculty(f1);

        // When university is destroyed, departments are lost but faculty survives
        uni = null;
    }
}
