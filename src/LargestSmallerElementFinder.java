public class LargestSmallerElementFinder {
    public static int findLargestSmallerElement(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1; // Initialize result

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                result = mid; // Update result
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int targetElement = 8;

        int result = findLargestSmallerElement(sortedArray, targetElement);

        if (result != -1) {
            System.out.println("Largest element smaller than or equal to " + targetElement + " is at index " + result + ".");
        } else {
            System.out.println("No such element found in the array.");
        }
    }
}
