package object_oriented_programming.ObjectModelling;

import java.util.*;

/*
 * Problem Statement:
 * Write a Java program to demonstrate Object Modelling
 * using University, Department, and Faculty classes
 * to show composition and independent association.
 */

/*
 * Class Name: Univ
 *
 * Description:
 * This class represents a University.
 * A university is composed of multiple departments.
 * When the university is deleted, all departments
 * are also removed, demonstrating composition.
 */
class Univ {

    // Name of the university
    private String name;

    // List of departments under the university
    private List<Dept> departments = new ArrayList<>();

    // Constructor to initialize university name
    Univ(String name) {

        // Assign university name
        this.name = name;
    }

    // Method to add a department to the university
    void addDepartment(String name) {

        // Create and add a new department
        departments.add(new Dept(name));
    }

    // Method to display university and department details
    void displayUniversity() {

        // Display university name
        System.out.println("University: " + name);

        // Check if departments exist
        if (departments.isEmpty()) {

            // Display message if no departments are present
            System.out.println(" No departments available.");

        } else {

            // Display department list heading
            System.out.println(" Departments:");

            // Display all departments
            for (Dept d : departments) {
                d.displayDept();
            }
        }

        System.out.println();
    }

    // Method to close university and remove all departments
    void closeUniversity() {

        // Clear all departments (composition effect)
        departments.clear();

        // Display deletion message
        System.out.println("University deleted with all departments");
    }
}

/*
 * Class Name: Dept
 *
 * Description:
 * This class represents a Department.
 * Departments exist only within a University,
 * demonstrating strong composition.
 */
class Dept {

    // Name of the department
    private String name;

    // Constructor to initialize department name
    Dept(String name) {

        // Assign department name
        this.name = name;
    }

    // Method to display department name
    void displayDept() {

        // Display department details
        System.out.println(" * " + name);
    }
}

/*
 * Class Name: Faculty
 *
 * Description:
 * This class represents a Faculty member.
 * Faculty exists independently of the University,
 * demonstrating association (not composition).
 */
class Faculty {

    // Name of the faculty member
    private String name;

    // Constructor to initialize faculty name
    Faculty(String name) {

        // Assign faculty name
        this.name = name;
    }

    // Method to return faculty name
    String getName() {
        return name;
    }
}

/*
 * Class Name: University
 *
 * Description:
 * This class contains the main method and demonstrates
 * composition (University–Department) and association
 * (Faculty existing independently).
 */
class University {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating University object
        Univ uni = new Univ("SRM University");

        // Adding departments to university
        uni.addDepartment("CSE");
        uni.addDepartment("ECE");

        // Creating Faculty object (independent of university)
        Faculty faculty = new Faculty("Dr. Jason Rajan");

        // Display faculty existence
        System.out.println("Faculty exists independently: " + faculty.getName());
        System.out.println();

        // Display university structure
        uni.displayUniversity();

        // Closing university (removes all departments)
        uni.closeUniversity();
    }
}
