import java.util.ArrayList;

public class CommonElementsFinder {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hii");
        list1.add("Geeks");
        list1.add("for");
        list1.add("Geeks");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hii");
        list2.add("Geeks");
        list2.add("Gaurav");

        list1.retainAll(list2);

        System.out.println("Common elements: " + list1);
    }
}
