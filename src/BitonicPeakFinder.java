public class BitonicPeakFinder {
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // Decreasing part, move left
                right = mid;
            } else {
                // Increasing part, move right
                left = mid + 1;
            }
        }

        return left; // Index of the peak element
    }

    public static void main(String[] args) {
        int[] bitonicArray = {1, 3, 5, 9, 7, 4, 2};
        int peakIndex = findPeakElement(bitonicArray);

        System.out.println("Peak element at index: " + peakIndex);
    }
}

