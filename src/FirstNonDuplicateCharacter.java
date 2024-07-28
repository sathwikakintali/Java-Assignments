public class FirstNonDuplicateCharacter {
    public static int findFirstNonDuplicate(String s) {
        int[] freq = new int[26]; // Initialize frequency array for lowercase letters

        // Populate the frequency array
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // No non-duplicate character found
    }

    public static void main(String[] args) {
        String input = "geeksforgeeks";
        int result = findFirstNonDuplicate(input);
        if (result != -1) {
            System.out.println("Index of the first non-duplicate character: " + result);
        } else {
            System.out.println("No non-duplicate character found in the string.");
        }
    }
}

