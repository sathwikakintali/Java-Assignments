import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram{
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray); // Sort the characters to create a unique key
            String sortedWord = new String(charArray);

            anagramsMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(anagramsMap.values());
    }

    public static void main(String[] args) {
        String[] inputWords = {"cat", "dog", "tac", "god", "act"};
        List<List<String>> result = groupAnagrams(inputWords);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
