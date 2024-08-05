import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static char findFirstNonRepeatedChar(String s) {
        // Create a LinkedHashMap to store character frequencies
        Map<Character, Integer> charFreq = new LinkedHashMap<>();

        // Update character frequencies
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeated character
        for (char c : s.toCharArray()) {
            if (charFreq.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeated character is found, return '\0'
        return '\0';
    }

    public static void main(String[] args) {
        String inputString = "abacddbe";
        char result = findFirstNonRepeatedChar(inputString);
        if (result != '\0') {
            System.out.println("The first non-repeated character in '" + inputString + "' is '" + result + "'.");
        } else {
            System.out.println("No non-repeated character found in '" + inputString + "'.");
        }
    }
}
