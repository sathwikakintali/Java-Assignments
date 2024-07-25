import java.util.Scanner;
public class PositiveNegativeSeperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] positiveNumbers = new int[size];
        int[] negativeNumbers = new int[size];
        int posIndex = 0;
        int negIndex = 0;

        for (int num : array) {
            if (num >= 0) {
                positiveNumbers[posIndex++] = num;
            } else {
                negativeNumbers[negIndex++] = num;
            }
        }

        // Trim the arrays to actual size
        int[] trimmedPositive = new int[posIndex];
        System.arraycopy(positiveNumbers, 0, trimmedPositive, 0, posIndex);

        int[] trimmedNegative = new int[negIndex];
        System.arraycopy(negativeNumbers, 0, trimmedNegative, 0, negIndex);

        System.out.println("Positive numbers: " + java.util.Arrays.toString(trimmedPositive));
        System.out.println("Negative numbers: " + java.util.Arrays.toString(trimmedNegative));

        scanner.close();
    }
}
