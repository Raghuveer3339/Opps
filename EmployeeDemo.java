class Employee {
    private String name;
    private int empId;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.empId = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getEmpId() { return empId; }
    public double getSalary() { return salary; }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', empId=%d, salary=%.2f}", name, empId, salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager() {
        super();
        this.department = "Unknown";
    }

    public Manager(String name, int empId, double salary, String department) {
        super(name, empId, salary);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return String.format("Manager{name='%s', empId=%d, salary=%.2f, department='%s'}",
                getName(), getEmpId(), getSalary(), department);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, 50000);
        System.out.println(emp1);
        emp1.increaseSalary(10);
        System.out.println("After 10% raise: " + emp1);

        Manager mgr1 = new Manager("Jane Smith", 201, 80000, "IT");
        System.out.println(mgr1);
        mgr1.increaseSalary(15);
        System.out.println("After 15% raise: " + mgr1);
        mgr1.setDepartment("HR");
        System.out.println("After changing department: " + mgr1);
    }
}
