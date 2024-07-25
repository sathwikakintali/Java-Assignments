public class ArraySumAndAverage {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example integer array

        // Calculate the sum of array elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Calculate the average (mean) of array elements
        double average = (double) sum / arr.length;

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
