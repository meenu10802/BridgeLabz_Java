package ObjectOrientedProgramming.Inheritance;

/*
 * EmployeeBase class
 * ------------------
 * Superclass representing a generic employee.
 * Contains common employee attributes.
 */
class EmployeeBase {
    String name;  // Employee name
    int id;  // Employee ID
    double salary;  // Employee salary

    // Constructor to initialize employee
    EmployeeBase(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println(name + " | " + id + " | " + salary);
    }
}

/*
 * ManagerEmployee class
 * ---------------------
 * Subclass representing a Manager with team size.
 * Inherits from EmployeeBase.
 */
class ManagerEmployee extends EmployeeBase {
    int teamSize;  // Number of team members

    // Constructor to initialize manager
    ManagerEmployee(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overridden method to include team size
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

/*
 * DeveloperEmployee class
 * -----------------------
 * Subclass representing a Developer with programming language.
 * Inherits from EmployeeBase.
 */
class DeveloperEmployee extends EmployeeBase {
    String programmingLanguage;  // Primary programming language

    // Constructor to initialize developer
    DeveloperEmployee(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.programmingLanguage = language;
    }

    // Overridden method to include programming language
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}

/*
 * InternEmployee class
 * --------------------
 * Subclass representing an Intern with duration.
 * Inherits from EmployeeBase.
 */
class InternEmployee extends EmployeeBase {
    int durationMonths;  // Internship duration in months

    // Constructor to initialize intern
    InternEmployee(String name, int id, double salary, int months) {
        super(name, id, salary);
        this.durationMonths = months;
    }

    // Overridden method to include internship duration
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Intern Duration: " + durationMonths + " months");
    }
}
