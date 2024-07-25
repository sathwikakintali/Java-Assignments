import java.util.Arrays;

public class MinMaxFinder {

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {4, 9, 6, 5, 2, 3};
        System.out.println("Minimum element is: " + findMin(array));
        System.out.println("Maximum element is: " + findMax(array));
    }
}
