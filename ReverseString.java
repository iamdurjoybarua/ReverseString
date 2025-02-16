import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console.
        Scanner input = new Scanner(System.in);

        try {
            // Prompt the user to enter a string.
            System.out.print("Enter a string: ");
            // Read the entire line of input from the user and store it in the 'originalString' variable.
            String originalString = input.nextLine(); // Reads the entire line, including spaces.

            // Reverse the string using StringBuilder's reverse() method.
            // 1. Create a new StringBuilder object with the original string.
            // 2. Call the reverse() method on the StringBuilder object to reverse the characters.
            // 3. Convert the reversed StringBuilder back to a String using toString().
            String reversedString = new StringBuilder(originalString).reverse().toString();

            // Print the reversed string.
            System.out.println("Reversed string: " + reversedString);

        } finally {
            // This block ensures that the Scanner is closed even if an exception occurs.
            if (input != null) {
                input.close(); // Close the Scanner to release resources and prevent leaks.
            }
        }
    }
}
