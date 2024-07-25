import java.util.Scanner;

public class MinOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double minimum = (num1 < num2) ? num1 : num2;

        System.out.println("The minimum of " + num1 + " and " + num2 + " is " + minimum);

        scanner.close();
    }
}
