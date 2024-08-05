import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 3, 5, 6, 5 };

        // Create a HashMap to store element frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Update element frequencies
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print duplicate elements and their counts
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate element: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
    }
}
