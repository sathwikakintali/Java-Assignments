import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String inputString = "hello world";

        // Initialize an empty HashMap to store character frequencies
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Iterate over each character in the input string
        for (char c : inputString.toCharArray()) {
            // Increment the count for the character
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Print the character frequencies
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
