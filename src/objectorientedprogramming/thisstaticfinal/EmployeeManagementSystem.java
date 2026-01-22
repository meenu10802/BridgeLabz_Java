package ObjectOrientedProgramming.ThisStaticFinal;

/*
 * EmployeeManagementSystem class
 * ------------------------------
 * This class represents employee records.
 * It uses static members, final ID, this keyword,
 * and instanceof validation.
 */
public class EmployeeManagementSystem {

    static String companyName = "Tech Corp";
    static int totalEmployees = 0;

    String name;
    String designation;
    final int id;

    // Constructor using this keyword
    EmployeeManagementSystem(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails(Object obj) {
        if (obj instanceof EmployeeManagementSystem) {
            System.out.println(name + " | " + id + " | " + designation);
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem emp = new EmployeeManagementSystem("Anil", 201, "Developer");
        emp.displayDetails(emp);
        displayTotalEmployees();
    }
}
