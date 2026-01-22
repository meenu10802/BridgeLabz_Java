package ObjectOrientedProgramming.Encapsulation;

/*
 * Department interface
 * --------------------
 * Defines contract for department-related operations.
 */
interface Department {
    // Method to assign department
    void assignDepartment(String dept);
    // Method to get department details
    String getDepartmentDetails();
}

/*
 * Employee abstract class
 * -----------------------
 * Abstract superclass representing a generic employee.
 * Uses encapsulation to protect employee data.
 */
abstract class Employee {
    // Private: Employee details are protected from unauthorized access
    private int employeeId;
    private String name;
    private String department;
    // Protected: Can be accessed by subclasses
    protected double baseSalary;

    // Constructor to initialize employee
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter for employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Getter for employee name
    public String getName() {
        return name;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Abstract method for salary calculation
    abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("----------------------");
    }
}

/*
 * FullTimeEmployee class
 * ----------------------
 * Represents a Full-Time Employee with fixed salary.
 * Implements Department interface.
 */
class FullTimeEmployee extends Employee implements Department {
    // Constructor to initialize full-time employee
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    // Full-time employees have fixed salary
    @Override
    double calculateSalary() {
        return baseSalary;
    }

    // Assign department to employee
    @Override
    public void assignDepartment(String dept) {
        setDepartment(dept);
    }

    // Get department details
    @Override
    public String getDepartmentDetails() {
        return getDepartment();
    }
}

/*
 * PartTimeEmployee class
 * ----------------------
 * Represents a Part-Time Employee with hourly pay.
 * Implements Department interface.
 */
class PartTimeEmployee extends Employee implements Department {
    int hoursWorked;  // Hours worked by part-time employee
    double hourlyRate;  // Hourly pay rate

    // Constructor to initialize part-time employee
    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Part-time salary based on hours and rate
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    // Assign department to employee
    @Override
    public void assignDepartment(String dept) {
        setDepartment(dept);
    }

    // Get department details
    @Override
    public String getDepartmentDetails() {
        return getDepartment();
    }
}

/*
 * EmployeeManagementSystem class
 * ------------------------------
 * Main class demonstrating polymorphism with different employee types.
 */
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating full-time and part-time employees
        Employee e1 = new FullTimeEmployee(101, "Kaviya", 50000);
        Employee e2 = new PartTimeEmployee(102, "Anu", 40, 500);

        // Assigning departments using interface methods
        ((Department) e1).assignDepartment("HR");
        ((Department) e2).assignDepartment("IT");

        // Creating array of employees
        Employee[] employees = {e1, e2};

        // Displaying details using polymorphism
        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
