import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NonReapeatingElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(9);
        arrList.add(4);
        arrList.add(9);
        arrList.add(6);
        arrList.add(7);
        arrList.add(4);

        // Create a hashmap to store the frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arrList) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find the first non-repeating element
        for (int num : arrList) {
            if (freqMap.get(num) == 1) {
                System.out.println("First non-repeating element: " + num);
                break;
            }
        }
    }
}
