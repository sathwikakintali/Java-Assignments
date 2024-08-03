import java.util.*;

public class SpecificSetBehaviour {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 5, 1, 2);
        printSets(list);
    }

    public static void printSets(List<Integer> list) {
        Set<Integer> hashSet = new HashSet<>(list);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(list);
        Set<Integer> treeSet = new TreeSet<>(list);

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
