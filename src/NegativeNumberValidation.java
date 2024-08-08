import java.util.InputMismatchException;
import java.util.Scanner;

// Custom unchecked exception class
class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class NegativeNumberValidation {
    public static void main(String[] args) {
        try {
            // Get integer input from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            // Check if the input is negative
            if (number < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed.");
            } else {
                System.out.println("Input is valid.");
            }
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    }
}
