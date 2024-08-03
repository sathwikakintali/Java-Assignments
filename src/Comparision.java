import java.util.*;
public class Comparision {
    public static void main(String[] args) {
        int size = 1000000;

        long start = System.currentTimeMillis();
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            hashSet.add(i);
        }
        for (int i = 0; i < size; i++) {
            hashSet.contains(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("HashSet: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            linkedHashSet.add(i);
        }
        for (int i = 0; i < size; i++) {
            linkedHashSet.contains(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedHashSet: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            treeSet.add(i);
        }
        for (int i = 0; i < size; i++) {
            treeSet.contains(i);
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet: " + (end - start) + " ms");
    }
}
