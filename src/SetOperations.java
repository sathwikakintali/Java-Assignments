import java.util.*;
public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setB = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(isSubset(setA, setB)); // true

        setA = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        setB = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(isSubset(setA, setB)); // true

        setA = new TreeSet<>(Arrays.asList(1, 2, 3));
        setB = new TreeSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(isSubset(setA, setB)); // true
    }

    public static boolean isSubset(Set<Integer> setA, Set<Integer> setB) {
        return setB.containsAll(setA);
    }
}
