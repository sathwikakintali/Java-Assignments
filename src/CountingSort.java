public class CountingSort {
    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        // Create a count array to store the frequency of each element
        int[] countArray = new int[max + 1];
        for (int i = 0; i < n; i++) {
            countArray[arr[i]]++;
        }

        // Update the count array to store the cumulative count
        for (int i = 1; i <= max; i++) {
            countArray[i] += countArray[i - 1];
        }

        // Create a sorted array using the count array
        int[] sortedArray = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            sortedArray[countArray[arr[i]] - 1] = arr[i];
            countArray[arr[i]]--;
        }

        // Copy the sorted array back to the original array
        System.arraycopy(sortedArray, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        countingSort(myArray);

        System.out.println("\nSorted array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
