package ObjectOrientedProgramming.ObjectModelling.Level1;

import java.util.ArrayList;

/*
 * EmployeeDetails class
 * ---------------------
 * Represents an employee that cannot exist without a Department (Composition).
 * This class is dependent on DepartmentDetails.
 */
class EmployeeDetails {
    String name;  // Name of the employee

    // Constructor to initialize employee
    EmployeeDetails(String name) {
        this.name = name;
    }
}

/*
 * DepartmentDetails class
 * -----------------------
 * Represents a department that composes employees (Composition).
 * Employees cannot exist without a department.
 */
class DepartmentDetails {
    // Collection of employees in this department
    ArrayList<EmployeeDetails> employees = new ArrayList<>();

    // Method to add an employee to the department
    void addEmployee(String name) {
        employees.add(new EmployeeDetails(name));
    }
}

/*
 * CompanyDetails class
 * -------------------
 * Represents a Company that owns Departments (Composition).
 * When company is deleted, all departments and employees are lost.
 */
class CompanyDetails {
    // Collection of departments in the company
    ArrayList<DepartmentDetails> departments = new ArrayList<>();

    // Method to add a department to the company
    void addDepartment() {
        departments.add(new DepartmentDetails());
    }

    public static void main(String[] args) {
        // Creating company and adding departments
        CompanyDetails company = new CompanyDetails();
        company.addDepartment();
        company.departments.get(0).addEmployee("Amit");

        // When company is deleted, departments & employees are also lost
        company = null;
    }
}
