import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.print("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String studentID;
    String course;
    int units;
    final int feePerUnit = 1000;

    Student(String name, int age, String studentID, String course, int units) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    double calculateFees() {
        return units * feePerUnit;
    }

    void displayInfo() {
        System.out.println("<~~~~~~~~~Student Info~~~~~~~~~>");
        System.out.println(name);
        System.out.println(age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Units fee: " + calculateFees());
        System.out.println();
    }

    static Student createStudentFromInput() {
        System.out.println("Student");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume the newline
        System.out.print("Enter student ID: ");
        String studentID = sc.nextLine();
        System.out.print("Enter course: ");
        String course = sc.nextLine();
        System.out.print("Enter units: ");
        int units = sc.nextInt();
        System.out.println();
        return new Student(name, age, studentID, course, units);
    }
}

class Instructor extends Person {
    String employeeID;
    String department;
    double salary;

    Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("<~~~~~~~~~Instructor Info~~~~~~~~~>");
        System.out.print(name);
        System.out.print(age);
        System.out.print("Employee ID: " + employeeID);
        System.out.print("Department: " + department);
        System.out.print("Salary: " + salary);
    }

    static Instructor createInstructorFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter instructor name: ");
        String name = sc.nextLine();
        System.out.print("Enter instructor age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume the newline
        System.out.print("Enter employee ID: ");
        String employeeID = sc.nextLine();
        System.out.print("Enter department: ");
        String department = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.println();
        return new Instructor(name, age, employeeID, department, salary);
    }
}

public class Main {
    static void printDetails(Person p) {
        p.displayInfo();
    }

    public static void main(String[] args) {
        Student s = Student.createStudentFromInput();
        printDetails(s)

        Student k = Student.createStudentFromInput();
        printDetails(k)

        Instructor i = Instructor.createInstructorFromInput();
        printDetails(i);

        Instructor t = Instructor.createInstructorFromInput();
        printDetails(t);
    }
}
