public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1); // Sort left subarray
            quickSort(arr, pivotIndex + 1, right); // Sort right subarray
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right]; // Choose the last element as the pivot
        int i = left - 1; // Index of smaller element

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j); // Swap elements
            }
        }

        swap(arr, i + 1, right); // Move pivot to its final position
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        quickSort(myArray, 0, myArray.length - 1);

        System.out.println("\nSorted array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
