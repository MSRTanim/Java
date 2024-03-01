import java.util.Scanner;

public class MultiplyTwoFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first floating-point number
        System.out.print("Enter the first floating-point number: ");
        float num1 = scanner.nextFloat();

        // Input the second floating-point number
        System.out.print("Enter the second floating-point number: ");
        float num2 = scanner.nextFloat();

        // Calculate the product
        float product = num1 * num2;

        // Display the result
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        // Close the scanner
        scanner.close();
    }
}
