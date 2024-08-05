import java.util.HashMap;
import java.util.Map;

class Employee {
    private String name;
    private int id;
    private String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                '}';
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        // Create a HashMap to store employee records (ID as key, Employee object as value)
        Map<Integer, Employee> employeeMap = new HashMap<>();

        // Add sample employee records
        employeeMap.put(101, new Employee("Alice", 101, "HR"));
        employeeMap.put(102, new Employee("Bob", 102, "IT"));
        employeeMap.put(103, new Employee("Charlie", 103, "Finance"));

        // Search for an employee by ID
        int searchId = 102;
        if (employeeMap.containsKey(searchId)) {
            Employee foundEmployee = employeeMap.get(searchId);
            System.out.println("Employee found: " + foundEmployee);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}
