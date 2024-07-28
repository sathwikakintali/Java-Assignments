import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementRemover {
    public static List<Integer> removeDuplicates(List<Integer> originalList) {
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (Integer num : originalList) {
            if (uniqueElements.add(num)) {
                resultList.add(num);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(2);
        originalList.add(4);
        originalList.add(3);
        originalList.add(5);

        List<Integer> result = removeDuplicates(originalList);

        System.out.println("Original list: " + originalList);
        System.out.println("List with duplicates removed: " + result);
    }
}
