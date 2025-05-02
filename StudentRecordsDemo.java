class Student {
    private int studentId;
    private String name;
    private char grade;

    public Student(int studentId, String name, char grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class StudentRecordsDemo {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice Johnson", 'A');
        Student student2 = new Student(102, "Bob Williams", 'B');

        System.out.println("Student Details:");
        student1.displayStudentInfo();
        System.out.println("-----------------");
        student2.displayStudentInfo();
    }
}
