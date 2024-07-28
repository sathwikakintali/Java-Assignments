import java.util.ArrayList;
import java.util.List;

public class IndexFinder {
    public static List<Integer> findIndices(int[] arr, int target) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices.add(i); // Add the index to the list
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        int[] myArray = {10, 5, 7, 5, 3, 5, 8};
        int targetNumber = 5;

        List<Integer> result = findIndices(myArray, targetNumber);
        if (!result.isEmpty()) {
            System.out.println("Indices where " + targetNumber + " appears: " + result);
        } else {
            System.out.println(targetNumber + " not found in the array.");
        }
    }
}
