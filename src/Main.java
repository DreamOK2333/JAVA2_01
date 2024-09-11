public class Main {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();

        // Step 1: Add 3 employees Jack, Alpha, and Cinder
        management.addEmployee(new Employee("Jack", 30));
        management.addEmployee(new Employee("Alpha", 25));
        management.addEmployee(new Employee("Cinder", 40));

        // Step 2: Delete employee Cinder
        management.deleteEmployee("Cinder");

        // Step 3: Add 2 more employees Jupyter, Diana
        management.addEmployee(new Employee("Jupyter", 35));
        management.addEmployee(new Employee("Diana", 28));

        management.printEmployees();// Step 4: Print all employees (should print in alphabetical order)
    }
}
