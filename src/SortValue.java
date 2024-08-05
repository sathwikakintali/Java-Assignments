import java.util.*;

public class SortValue {
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        LinkedHashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            temp.put(entry.getKey(), entry.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        // Add other key-value pairs here

        Map<String, Integer> sortedMap = sortByValue(hm);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
