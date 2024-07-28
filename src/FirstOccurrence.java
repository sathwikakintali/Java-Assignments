import java.util.List;
public class FirstOccurrence {
    public static int findFirstOccurrence(List<Integer> numbers, int target) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                return i; // Found the first occurrence
            }
        }
        return -1; // Number not found
    }

    public static void main(String[] args) {
        // Example usage:
        List<Integer> myList = List.of(1, 3, 5, 5, 7, 9, 5, 2);
        int targetNumber = 5;
        int result = findFirstOccurrence(myList, targetNumber);

        if (result != -1) {
            System.out.println("First occurrence of " + targetNumber + " is at index " + result);
        } else {
            System.out.println(targetNumber + " not found in the list.");
        }
    }
}
