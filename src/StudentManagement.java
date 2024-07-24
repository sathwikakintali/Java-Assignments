class Student {
    private int studentId;
    private String name;
    private int age;
    private char grade;

    // Constructor
    public Student(int studentId, String name, int age, char grade) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student(101, "Alice", 20, 'A');
        Student student2 = new Student(102, "Bob", 21, 'B');

        // Display student details
        student1.displayDetails();
        student2.displayDetails();
    }
}
