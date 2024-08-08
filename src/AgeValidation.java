import java.util.InputMismatchException;
import java.util.Scanner;

// Custom checked exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {
    public static void main(String[] args) {
        try {
            // Get age input from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check if age is less than 18
            if (age < 18) {
                throw new InvalidAgeException("Age must be at least 18 years.");
            } else {
                System.out.println("Age is valid.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer for age.");
        }
    }
}

