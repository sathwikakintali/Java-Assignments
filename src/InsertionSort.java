public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key into the correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        insertionSort(myArray);

        System.out.println("\nSorted array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
