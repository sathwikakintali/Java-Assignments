import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String inputString = "hello world";
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
