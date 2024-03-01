// Define a simple class named "Person"
class Person {
    // Class variables (attributes)
    String name;
    int age;

    // Class method (behavior)
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to demonstrate the class and object
public class ClassAndObjectExample {
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person1 = new Person();

        // Set values for the object's attributes
        person1.name = "John";
        person1.age = 30;

        // Call the method to display details of the person
        System.out.println("Details of Person 1:");
        person1.displayDetails();

        // Create another object of the Person class
        Person person2 = new Person();

        // Set values for the second object's attributes
        person2.name = "Alice";
        person2.age = 25;

        // Call the method to display details of the second person
        System.out.println("\nDetails of Person 2:");
        person2.displayDetails();
    }
}
