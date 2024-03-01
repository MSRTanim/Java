import java.util.Scanner;

class Student {
    // Class variables (attributes)
    String name;
    int rollNumber;
    double marks;

    // Class method to display student details
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    // Class method to calculate and display student grade
    void calculateGrade() {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}

public class StudentClassExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of the Student class
        Student student1 = new Student();

        // Set values for the object's attributes
        System.out.print("Enter student name: ");
        student1.name = scanner.nextLine();

        System.out.print("Enter student roll number: ");
        student1.rollNumber = scanner.nextInt();

        System.out.print("Enter student marks: ");
        student1.marks = scanner.nextDouble();

        // Call the displayDetails method to show student details
        student1.displayDetails();

        // Call the calculateGrade method to show student grade
        student1.calculateGrade();

        // Close the scanner
        scanner.close();
    }
}
