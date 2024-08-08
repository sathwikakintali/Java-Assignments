public class ExceptionHeirarchyDemo {
    public static void main(String[] args) {
        try {
            // Example 1: ArithmeticException
            int result = 100 / 0; // Division by zero
            System.out.println("Result: " + result);

            // Example 2: NullPointerException
            String str = null;
            int length = str.length(); // Attempting to access length of null reference
            System.out.println("String length: " + length);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero.");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Attempted to use a null reference.");
        } catch (Exception e) {
            System.out.println("Generic Exception: Something went wrong.");
        }
    }
}
