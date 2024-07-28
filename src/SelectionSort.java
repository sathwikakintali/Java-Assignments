public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the remaining unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        selectionSort(myArray);

        System.out.println("\nSorted array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
