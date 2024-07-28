import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementFinder {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);

        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (Integer num : numbers) {
            if (!uniqueElements.add(num)) {
                // Element is already present (duplicate)
                duplicateElements.add(num);
            }
        }

        System.out.println("Duplicate elements in the list:");
        for (Integer duplicate : duplicateElements) {
            System.out.println(duplicate);
        }
    }
}
