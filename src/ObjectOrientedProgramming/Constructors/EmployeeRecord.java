package ObjectOrientedProgramming.Constructors.Level1;

/*
 * EmployeeRecord class
 * --------------------
 * Demonstrates protected access in subclasses.
 */
public class EmployeeRecord {

    public int employeeID;
    protected String department;
    private double salary;

    public void updateSalary(double salary) {
        this.salary = salary;
    }
}

// Subclass
class ManagerRecord extends EmployeeRecord {

    void displayManager() {
        System.out.println(employeeID + " - " + department);
    }
}
