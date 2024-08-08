import java.util.Scanner;

public class DivideByInput {
    public static void main(String[] args) {
        try {
            // Get input from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();

            // Divide 100 by the input number
            int result = 100 / input;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
