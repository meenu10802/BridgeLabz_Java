package object_oriented_programming.ObjectModelling;

import java.util.ArrayList;

/*
 * Problem Statement:
 * Write a Java program to demonstrate Object Modelling
 * using composition by representing a Company that
 * contains Departments, and each Department contains Employees.
 */

/*
 * Class Name: EmployeeComp
 *
 * Description:
 * This class represents an Employee.
 * It is a part of a Department and demonstrates
 * the concept of composition.
 */
class EmployeeComp {

    // Name of the employee
    private String name;

    // Role/designation of the employee
    private String role;

    // Constructor to initialize employee details
    public EmployeeComp(String name, String role) {

        // Assign employee name
        this.name = name;

        // Assign employee role
        this.role = role;
    }

    // Method to display employee details
    public void displayEmployee() {

        // Display employee name and role
        System.out.println("   Employee: " + name + " | Role: " + role);
    }
}

/*
 * Class Name: DepartmentComp
 *
 * Description:
 * This class represents a Department within a company.
 * A department contains multiple employees,
 * demonstrating a one-to-many composition relationship.
 */
class DepartmentComp {

    // Name of the department
    private String deptName;

    // List of employees in the department
    private ArrayList<EmployeeComp> employees;

    // Constructor to initialize department details
    public DepartmentComp(String deptName) {

        // Assign department name
        this.deptName = deptName;

        // Initialize employee list
        this.employees = new ArrayList<>();
    }

    // Method to return department name
    public String getDeptName() {
        return deptName;
    }

    // Method to add an employee to the department
    public void addEmployee(String name, String role) {

        // Create and add new EmployeeComp object
        employees.add(new EmployeeComp(name, role));
    }

    // Method to display department details and employees
    public void displayDept() {

        // Display department name
        System.out.println(" Department: " + deptName);

        // Display all employees in the department
        for (EmployeeComp e : employees) {
            e.displayEmployee();
        }

        System.out.println();
    }
}

/*
 * Class Name: CompanyComp
 *
 * Description:
 * This class represents a Company.
 * A company is composed of multiple departments,
 * and deleting the company removes all its departments,
 * demonstrating strong composition.
 */
class CompanyComp {

    // Name of the company
    private String companyName;

    // List of departments in the company
    private ArrayList<DepartmentComp> departments;

    // Constructor to initialize company details
    public CompanyComp(String companyName) {

        // Assign company name
        this.companyName = companyName;

        // Initialize department list
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(String deptName) {

        // Add new DepartmentComp object
        departments.add(new DepartmentComp(deptName));
    }

    // Method to retrieve a department by name
    public DepartmentComp getDepartment(String deptName) {

        // Search for department in list
        for (DepartmentComp d : departments) {
            if (d.getDeptName().equals(deptName)) {
                return d;
            }
        }

        // Return null if department not found
        return null;
    }

    // Method to display company details
    public void displayCompany() {

        // Display company name
        System.out.println("Company: " + companyName);

        // Display all departments and their employees
        for (DepartmentComp d : departments) {
            d.displayDept();
        }
    }

    // Method to delete company and its departments
    public void deleteCompany() {

        // Display deletion message
        System.out.println("Deleting company: " + companyName);

        // Clear all departments (composition effect)
        departments.clear();
    }
}

/*
 * Class Name: CompanyDeptComp
 *
 * Description:
 * This class contains the main method and demonstrates
 * object interactions between Company, Department,
 * and Employee using composition.
 */
public class CompanyDeptComp {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating Company object
        CompanyComp company = new CompanyComp("Capgemini");

        // Adding departments to the company
        company.addDepartment("IT");
        company.addDepartment("Human Resource");

        // Retrieving IT department
        DepartmentComp itDept = company.getDepartment("IT");
        if (itDept != null) {

            // Adding employees to IT department
            itDept.addEmployee("Dinesh", "Software Engineer");
            itDept.addEmployee("Jason", "System Admin");
        }

        // Retrieving Human Resource department
        DepartmentComp hrDept = company.getDepartment("Human Resource");
        if (hrDept != null) {

            // Adding employee to HR department
            hrDept.addEmployee("Karthik", "HR Manager");
        }

        // Display company structure
        company.displayCompany();

        // Delete company (composition cleanup)
        company.deleteCompany();

        // Display company after deletion
        company.displayCompany();
    }
}
