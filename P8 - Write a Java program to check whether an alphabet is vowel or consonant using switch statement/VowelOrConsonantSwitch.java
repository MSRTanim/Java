import java.util.Scanner;

public class VowelOrConsonantSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a single character
        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().charAt(0);

        // Check if the input is a valid alphabet character
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            // Convert the character to lowercase for simplicity
            ch = Character.toLowerCase(ch);

            // Check if the character is a vowel or consonant using switch statement
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet character.");
        }

        // Close the scanner
        scanner.close();
    }
}
