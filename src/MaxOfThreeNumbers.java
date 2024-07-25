import java.util.Scanner;

public class MaxOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        // Find the maximum of the three numbers
        int max = (a>b)?((a>c)?a:c):((b>c)?b:c);

        System.out.println("Maximum of the three numbers: " + max);

        scanner.close();
    }
}
