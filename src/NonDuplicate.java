import java.util.*;
public class NonDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        System.out.println(findFirstNonDuplicate(list));
    }

    public static Integer findFirstNonDuplicate(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer i : list) {
            if (set.contains(i)) {
                duplicates.add(i);
            } else {
                set.add(i);
            }
        }

        set.removeAll(duplicates);

        return set.isEmpty() ? null : set.iterator().next();
    }
}
