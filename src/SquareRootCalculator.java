public class SquareRootCalculator {
    public static double squareRoot(double number, int precision) {
        // Initialize the search range
        double left = 0;
        double right = number;
        double ans = 0;

        // Binary search for integral part
        while (left <= right) {
            double mid = (left + right) / 2;
            double square = mid * mid;

            if (square == number) {
                ans = mid;
                break;
            } else if (square < number) {
                left = mid;
                ans = mid;
            } else {
                right = mid;
            }
        }

        // Compute fractional part
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (ans * ans <= number) {
                ans += increment;
            }
            ans -= increment;
            increment /= 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        double inputNumber = 50;
        int precision = 3;

        double result = squareRoot(inputNumber, precision);
        System.out.println("Square root of " + inputNumber + " (up to " + precision + " decimal places): " + result);
    }
}
