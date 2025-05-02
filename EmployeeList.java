import java.util.*;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class EmployeeList {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ravi", 101, 50000));
        employees.add(new Employee("Sneha", 102, 60000));
        employees.add(new Employee("Aman", 103, 55000));

        // Update salary
        for (Employee e : employees) {
            if (e.id == 102) {
                e.salary = 65000;
            }
        }

        // Remove employee with id = 103
        employees.removeIf(e -> e.id == 103);

        // Print remaining employees
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
