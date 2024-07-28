public class Charactercounter {
    public static int countOccurrences(String input, char targetChar) {
        int count = 0; // Initialize the counter

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                count++; // Increment the counter if the character matches the target
            }
        }

        return count; // Return the total count
    }

    public static void main(String[] args) {
        String myString = "programming is fun!";
        char target = 'm';

        int result = countOccurrences(myString, target);
        System.out.println("Occurrences of '" + target + "': " + result);
    }
}
