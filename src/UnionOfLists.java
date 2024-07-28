import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfLists {
    public static <T> List<T> union(List<T> list1, List<T> list2) {
        Set<T> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);
        return new ArrayList<>(unionSet);
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);

        List<Integer> unionList = union(list1, list2);

        System.out.println("Union of the lists: " + unionList);
    }
}
