public class LastOccurrenceFinder {
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int lastOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                lastOccurrence = mid; // Update last occurrence
                left = mid + 1; // Search right half for later occurrences
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return lastOccurrence;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 5, 5, 5, 7, 11, 11, 13};
        int targetElement = 5;

        int result = findLastOccurrence(sortedArray, targetElement);

        if (result != -1) {
            System.out.println("Last occurrence of " + targetElement + " is at index " + result + ".");
        } else {
            System.out.println(targetElement + " not found in the array.");
        }
    }
}
