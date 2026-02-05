package collectionsandstreams.ioStreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Stores a list of employees in a file using ObjectOutputStream and
 * retrieves them using ObjectInputStream (serialization/deserialization).
 * Employee class (id, name, department, salary) is included in this file.
 */
public class EmployeeSerialization {

    static class Employee implements Serializable {
        private static final long serialVersionUID = 1L;
        private int id;
        private String name;
        private String department;
        private double salary;

        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
        }
    }
    private static final String FILE_PATH = "src/collecctionsandstreams/ioStreams/employees.dat";

    public static void main(String[] args) {
        // Create sample list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "Engineering", 75000));
        employees.add(new Employee(2, "Bob", "HR", 55000));
        employees.add(new Employee(3, "Carol", "Engineering", 80000));

        // Serialize list to file
        try {
            saveEmployees(employees);
            System.out.println("Employees saved to " + FILE_PATH);
        } catch (IOException e) {
            System.err.println("Error saving: " + e.getMessage());
        }

        // Deserialize and display
        try {
            List<Employee> loaded = loadEmployees();
            System.out.println("Loaded employees:");
            for (Employee e : loaded) {
                System.out.println("  " + e);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading: " + e.getMessage());
        }
    }

    /**
     * Writes the list of employees to file using ObjectOutputStream.
     */
    static void saveEmployees(List<Employee> employees) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(employees);
            oos.flush();
        }
    }

    /**
     * Reads the list of employees from file using ObjectInputStream.
     */
    @SuppressWarnings("unchecked")
    static List<Employee> loadEmployees() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Employee>) ois.readObject();
        }
    }
}
