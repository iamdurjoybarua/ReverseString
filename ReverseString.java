import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String originalString = input.nextLine(); // Reads the entire line of input

            String reversedString = new StringBuilder(originalString).reverse().toString();

            System.out.println("Reversed string: " + reversedString);

        } finally {
            if (input != null) {
                input.close(); // Close the Scanner to prevent resource leaks
            }
        }
    }
}