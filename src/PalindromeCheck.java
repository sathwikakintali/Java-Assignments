public class PalindromeCheck {

    public static boolean isPalindrome(String s) {
        // Remove spaces and convert to lowercase
        s = s.replace(" ", "").toLowerCase();

        // Check if the string is equal to its reverse
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        String inputString = "madam";
        boolean result = isPalindrome(inputString);
        System.out.println("Is '" + inputString + "' a palindrome? " + result);
    }
}
