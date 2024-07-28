import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(-5);
        arrList.add(3);
        arrList.add(-1);
        arrList.add(7);
        arrList.add(-2);

        // Custom comparator based on absolute value
        Comparator<Integer> customComparator = (a, b) -> Integer.compare(Math.abs(a), Math.abs(b));

        // Sort the ArrayList using the custom comparator
        Collections.sort(arrList, customComparator);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList (by absolute value):");
        for (int num : arrList) {
            System.out.print(num + " ");
        }
    }
}
