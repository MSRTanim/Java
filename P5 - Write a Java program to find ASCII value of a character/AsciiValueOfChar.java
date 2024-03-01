import java.util.Scanner;

public class AsciiValueOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Find the ASCII value
        int asciiValue = (int) character;

        // Display the result
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);

        // Close the scanner
        scanner.close();
    }
}
