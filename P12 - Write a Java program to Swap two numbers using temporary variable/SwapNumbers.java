import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Display the numbers before swapping
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swap the numbers using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display the numbers after swapping
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        // Close the scanner
        scanner.close();
    }
}
