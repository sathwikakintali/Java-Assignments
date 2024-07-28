import java.util.ArrayList;

public class PalindromeChecker {
    public static void main(String[] args) {
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('r');
        charList.add('a');
        charList.add('c');
        charList.add('e');
        charList.add('c');
        charList.add('a');
        charList.add('r');

        boolean isPalindrome = true;
        int front = 0;
        int back = charList.size() - 1;

        while (front < back) {
            if (!charList.get(front).equals(charList.get(back))) {
                isPalindrome = false;
                break;
            }
            front++;
            back--;
        }

        if (isPalindrome) {
            System.out.println("The ArrayList forms a palindrome.");
        } else {
            System.out.println("The ArrayList is not a palindrome.");
        }
    }
}
