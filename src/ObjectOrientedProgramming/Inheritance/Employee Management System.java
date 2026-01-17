package ObjectOrientedProgramming.Inheritance;

/*
 * Problem Statement:
 * Write a Java program to demonstrate inheritance and
 * method overriding using different types of employees.
 */

/*
 * Class Name: Employee
 *
 * Description:
 * This superclass represents a generic employee.
 * It stores common attributes such as name, id,
 * and salary, and provides a method to display details.
 */
class Employee {

    // Name of the employee
    String name;

    // Unique employee ID
    int id;

    // Salary of the employee
    double salary;

    // Constructor to initialize employee details
    Employee(String name, int id, double salary) {

        // Assign employee name
        this.name = name;

        // Assign employee ID
        this.id = id;

        // Assign employee salary
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {

        // Display name, id, and salary
        System.out.println(name + " " + id + " " + salary);
    }
}

/*
 * Class Name: Manager
 *
 * Description:
 * This class represents a Manager.
 * It extends the Employee class and adds
 * manager-specific information like team size.
 */
class Manager extends Employee {

    // Number of team members managed
    int teamSize;

    // Constructor to initialize manager details
    Manager(String name, int id, double salary, int teamSize) {

        // Call superclass constructor
        super(name, id, salary);

        // Assign team size
        this.teamSize = teamSize;
    }

    // Overriding displayDetails method
    @Override
    void displayDetails() {

        // Display employee details along with team size
        System.out.println(name + " " + id + " " + salary + " " + teamSize);
    }
}

/*
 * Class Name: Developer
 *
 * Description:
 * This class represents a Developer.
 * It extends the Employee class and adds
 * programming language specialization.
 */
class Developer extends Employee {

    // Primary programming language used by the developer
    String programmingLanguage;

    // Constructor to initialize developer details
    Developer(String name, int id, double salary, String programmingLanguage) {

        // Call superclass constructor
        super(name, id, salary);

        // Assign programming language
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails method
    @Override
    void displayDetails() {

        // Display employee details along with programming language
        System.out.println(name + " " + id + " " + salary + " " + programmingLanguage);
    }
}

/*
 * Class Name: Intern
 *
 * Description:
 * This class represents an Intern.
 * It extends the Employee class and adds
 * internship duration information.
 */
class Intern extends Employee {

    // Duration of internship in months
    int durationMonths;

    // Constructor to initialize intern details
    Intern(String name, int id, double salary, int durationMonths) {

        // Call superclass constructor
        super(name, id, salary);

        // Assign internship duration
        this.durationMonths = durationMonths;
    }

    // Overriding displayDetails method
    @Override
    void displayDetails() {

        // Display employee details along with internship duration
        System.out.println(name + " " + id + " " + salary + " " + durationMonths);
    }
}
