public class FirstOccurrenceFinder {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int firstOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                firstOccurrence = mid; // Update first occurrence
                right = mid - 1; // Search left half for earlier occurrences
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return firstOccurrence;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 5, 7, 9, 11, 11, 13, 15};
        int targetElement = 11;

        int result = findFirstOccurrence(sortedArray, targetElement);

        if (result != -1) {
            System.out.println("First occurrence of " + targetElement + " is at index " + result + ".");
        } else {
            System.out.println(targetElement + " not found in the array.");
        }
    }
}
