import java.util.*;
public class Maintain
{
    public static void main(String[] args) {
        List<String> l = Arrays.asList("apple", "banana", "apple", "orange");
        LinkedHashSet<String> d = new LinkedHashSet<>(l);
        System.out.println(d);
    }
}
