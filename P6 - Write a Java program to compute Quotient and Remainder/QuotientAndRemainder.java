import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dividenda
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        // Input the divisor
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Compute the quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Display the result
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Close the scanner
        scanner.close();
    }
}
