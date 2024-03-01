import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a single character
        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().charAt(0);

        // Convert the character to lowercase for simplicity
        ch = Character.toLowerCase(ch);

        // Check if the input is a valid alphabet character
        if (ch >= 'a' && ch <= 'z') {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet character.");
        }

        // Close the scanner
        scanner.close();
    }
}
