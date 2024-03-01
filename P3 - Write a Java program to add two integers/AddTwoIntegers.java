import java.util.Scanner;

public class AddTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Input the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
