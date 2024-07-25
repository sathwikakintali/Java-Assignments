public class AnagramChecker {

    public static boolean areAnagrams(String s1, String s2) {
        // Remove spaces and convert to lowercase
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        // Check if the sorted strings are equal
        return s1.equals(new StringBuilder(s2).reverse().toString());
    }

    public static void main(String[] args) {
        String inputStr1 = "listen";
        String inputStr2 = "silent";
        boolean result = areAnagrams(inputStr1, inputStr2);
        System.out.println("Are '" + inputStr1 + "' and '" + inputStr2 + "' anagrams? " + result);
    }
}
