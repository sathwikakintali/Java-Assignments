import java.util.*;
public class SortedUniqueElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 2, 9, 1, 2, 9);
        System.out.println(sortedUniqueElements(list));
    }

    public static TreeSet<Integer> sortedUniqueElements(List<Integer> list) {
        return new TreeSet<>(list);
    }
}
