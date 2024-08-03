import java.util.*;
public class SetBehaviour {
    public static void main(String[] args) {
        List<Integer> l =Arrays.asList(5,3,5,1,2);
        HashSet<Integer> h = new HashSet<>(l);
        LinkedHashSet<Integer> i = new LinkedHashSet<>(l);
        TreeSet<Integer> t = new TreeSet<>(l);
        System.out.println(h);
        System.out.println(i);
        System.out.println(t);
    }
}
