package collectionsandstreams.collections.map;

import java.util.*;

/*
 * Group employees by department
 */
class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class GroupByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped = new HashMap<>();

        for (Employee emp : employees) {
            grouped
                    .computeIfAbsent(emp.department, k -> new ArrayList<>())
                    .add(emp);
        }

        for (Map.Entry<String, List<Employee>> entry : grouped.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            entry.getValue().forEach(e -> System.out.print(e.name + " "));
            System.out.println();
        }
    }
}
