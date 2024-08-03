import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        Integer[] arro = {1,6,5,7};
        Integer[] arrt = {2,7,6,4};
        Integer[] arre = {3,4,5,6,7};
        Set<Integer> s = new HashSet<>(Arrays.asList(arro));
        Set<Integer> e = new HashSet<>(Arrays.asList(arrt));
        Set<Integer> t = new HashSet<>(Arrays.asList(arre));
        e.retainAll(s);
        t.retainAll(e);
        System.out.println("intersection of all the sets is :"+t);
    }
}
