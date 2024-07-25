public class CharacterFrequencyCounter {

    public static void main(String[] args) {
        String inputString = "sathwika";

        inputString = inputString.replace(" ", "").toLowerCase();


        int[] charFrequency = new int[26];

        for (char c : inputString.toCharArray()) {
            charFrequency[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (charFrequency[i] > 0) {
                char c = (char) ('a' + i);
                System.out.println("'" + c + "': " + charFrequency[i]);
            }
        }
    }
}
