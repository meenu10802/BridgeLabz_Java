package ObjectOrientedProgramming.ClassAndObjects.Level1;

/*
 * Employee class
 * ----------------
 * This class represents an Employee entity.
 * It stores basic employee details such as name, ID, and salary.
 * The class provides a method to display employee information.
 */
public class Employee {

    // Attributes to store employee details
    String name;
    int id;
    double salary;

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee();

        // Assigning values to attributes
        emp.name = "Rahul";
        emp.id = 101;
        emp.salary = 50000;

        // Displaying employee details
        emp.displayDetails();
    }
}
