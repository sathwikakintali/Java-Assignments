import java.util.*;

public class InsertionOrder {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        Set<String> set = maintainOrder(list);
        System.out.println(set);
    }

    public static Set<String> maintainOrder(List<String> list) {
        return new LinkedHashSet<>(list);
    }
}
