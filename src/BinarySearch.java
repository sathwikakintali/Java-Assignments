public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int targetElement = 7;

        int result = binarySearch(sortedArray, targetElement);

        if (result != -1) {
            System.out.println("Element " + targetElement + " found at index " + result + ".");
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }
    }
}
