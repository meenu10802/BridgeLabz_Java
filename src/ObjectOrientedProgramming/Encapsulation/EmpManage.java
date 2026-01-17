package object_oriented_programming.Encapsulation;

import java.util.*;

/*
 * Problem Statement:
 * Write a Java program to demonstrate encapsulation, abstraction,
 * interfaces, inheritance, and polymorphism using an employee
 * management system.
 */

/*
 * Interface Name: Department
 *
 * Description:
 * This interface defines department-related behaviors
 * that an employee must support.
 */
interface Department {

    // Method to assign a department to an employee
    void assignDepartment(String name);

    // Method to return department details
    String getDepartmentDetails();
}

/*
 * Abstract Class Name: Employee
 *
 * Description:
 * This abstract class represents a generic employee.
 * It demonstrates encapsulation using private variables,
 * implements the Department interface, and provides
 * common employee-related functionality.
 */
abstract class Employee implements Department {

    // Unique identifier for employee
    private int employeeId;

    // Name of the employee
    private String name;

    // Base salary or rate of the employee
    private double baseSalary;

    // Department assigned to the employee
    private String department;

    // Constructor to initialize employee details
    Employee(int employeeId, String name, double baseSalary) {

        // Assign employee ID
        this.employeeId = employeeId;

        // Assign employee name
        this.name = name;

        // Assign base salary
        this.baseSalary = baseSalary;
    }

    // Getter method for employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Getter method for employee name
    public String getName() {
        return name;
    }

    // Getter method for base salary
    public double getBaseSalary() {
        return baseSalary;
    }

    // Implementation of Department interface method
    public void assignDepartment(String name) {

        // Assign department name
        this.department = name;
    }

    // Implementation of Department interface method
    public String getDepartmentDetails() {

        // Return department name
        return department;
    }

    // Abstract method to calculate salary (implemented by subclasses)
    abstract double calculateSalary();

    // Method to display employee details
    void displayDetails() {

        // Print employee ID, name, and calculated salary
        System.out.println(employeeId + " " + name + " " + calculateSalary());
    }
}

/*
 * Class Name: FullTimeEmployee
 *
 * Description:
 * This class represents a full-time employee.
 * It extends the Employee abstract class and
 * provides salary calculation logic.
 */
class FullTimeEmployee extends Employee {

    // Constructor to initialize full-time employee details
    FullTimeEmployee(int id, String name, double salary) {

        // Call parent class constructor
        super(id, name, salary);
    }

    // Implementation of salary calculation for full-time employee
    double calculateSalary() {

        // Salary equals base salary
        return getBaseSalary();
    }
}

/*
 * Class Name: PartTimeEmployee
 *
 * Description:
 * This class represents a part-time employee.
 * It extends the Employee class and calculates
 * salary based on hourly rate and working hours.
 */
class PartTimeEmployee extends Employee {

    // Number of hours worked
    private int hours;

    // Constructor to initialize part-time employee details
    PartTimeEmployee(int id, String name, double rate, int hours) {

        // Call parent class constructor
        super(id, name, rate);

        // Assign working hours
        this.hours = hours;
    }

    // Implementation of salary calculation for part-time employee
    double calculateSalary() {

        // Salary equals hourly rate multiplied by hours worked
        return getBaseSalary() * hours;
    }
}

/*
 * Class Name: EmpManage
 *
 * Description:
 * This class contains the main method and demonstrates
 * polymorphism by storing different employee types
 * in a common list and processing them uniformly.
 */
public class EmpManage {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating a list to store Employee objects
        List<Employee> employees = new ArrayList<>();

        // Adding a full-time employee to the list
        employees.add(new FullTimeEmployee(1, "Aayush", 50000));

        // Adding a part-time employee to the list
        employees.add(new PartTimeEmployee(2, "Rahul", 500, 40));

        // Iterating through the employee list
        for (Employee e : employees) {

            // Display details of each employee
            e.displayDetails();
        }
    }
}
