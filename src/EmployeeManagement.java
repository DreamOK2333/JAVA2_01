import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeManagement {
    private List<Employee> employeeList = new ArrayList<>();

    // Add a new employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    // Delete an employee by name
    public void deleteEmployee(String name) {
        employeeList.removeIf(employee -> employee.getName().equalsIgnoreCase(name));
    }

    // Print all employees sorted by name
    public void printEmployees() {
        Collections.sort(employeeList, Comparator.comparing(Employee::getName));
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
