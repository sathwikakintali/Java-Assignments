public class MaximumElementFinder {
    public static int findMaximum(int[] arr) {
        int max = arr[0]; // Initialize max with the first element

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }

        return max; // Return the maximum element
    }

    public static void main(String[] args) {
        int[] myArray = {10, 324, 45, 90, 9808};
        int maxElement = findMaximum(myArray);
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}
